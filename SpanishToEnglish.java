import java.util.*;

public class SpanishToEnglish 
{
	public Map<String,String> translation;
	
	public SpanishToEnglish(Scanner fs) 
	{
		System.out.println("MAP CONTENTS");
		
		translation = new TreeMap<String,String>();
		
		int num = Integer.parseInt(fs.nextLine());
		
		for(int x=0; x<num; x++)
		{
			input(fs.nextLine());
		}
		
		Set<String> temp = translation.keySet();
		
		Iterator<String> it = temp.iterator();
		
		String str = "";
		
		str = it.next();
		
		System.out.println("{"+str+"="+translation.get(str));
		
		for(int x=0; x<translation.size()-2; x++)
		{
		    str = it.next();
		    System.out.println(" "+str+"="+translation.get(str));
		}
		
		str = it.next();
		
		System.out.println(" "+str+"="+translation.get(str)+"}");
		System.out.println("READ LINES");
	
		
		while(fs.hasNextLine())
		{
			System.out.println(translation(fs.nextLine()));
		}
	}
	
	public void input(String in) 
	{ 
		String[] list = in.split(" ");
		translation.put(list[0], list[1]);
	}
	
	public Map<String,String> getPairs()
	{
		return translation;
	}
	
	public String translation(String sent) 
	{ 
		String[] list = sent.split(" ");
		String result = "";
		
		for(int x=0;x<list.length;x++)
		{
			result += translation.get(list[x]) + " ";
		}
		return result;
	}
	
}