import java.util.*;
import java.io.*;
class Histogram
{
	public Map<String,Integer> histo;
	public String str;
	
	public Histogram()
	{
		histo = new TreeMap<String,Integer>();
	}

	public Histogram(String sent)
	{
		histo = new TreeMap<String,Integer>();
		str = sent;
		generate(sent);
	}
	
	public void generate(String line)
	{
		Scanner sc = new Scanner(line);
		
		while(sc.hasNext())
		{
			String temp = sc.next();
			
			if(histo.get(temp) == null)
			{
				histo.put(temp,1);
			}
				
			else
			{
				histo.put(temp,histo.get(temp)+1);
			}
				
		}
		sc.close();
	}

	public String toString()
	{
		Set<String> letters = new TreeSet<String>(histo.keySet());
		
		Iterator<String> it = letters.iterator();
		
		String result="char\t1---5----01---5\n";
		String str="";
		
		while(it.hasNext())
		{
			String temp = it.next();
			
			int count = histo.get(temp);
			str = "";
			
			for(int j = 0;j<count;j++)
			{
				str+= "*";
			}
			
			result += temp+"\t"+str+"\n";
			
		}
		
		return result+"";
	}
}