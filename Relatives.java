import java.util.*;
public class Relatives 
{
	TreeMap<String, TreeSet<String>> rel;
	
	public Relatives()
	{
		rel = new TreeMap <String, TreeSet<String>>();
	}
	
	public void add(String str1, String str2)
	{
		TreeSet<String> temp;
		
		if(rel.get(str1) == null)
		{
			temp = new TreeSet<>();
		}
			
		else
		{
			temp = rel.get(str1);
		}
			
		
		temp.add(str2);
		
		rel.put(str1, temp);
	}
	
	public void out(String x)
	{
		System.out.println(x + " is related to " + rel.get(x).toString());
	}
	
	public void print()
	{
		for(String x: rel.keySet())
		{
			System.out.print(x+" is related to ");
			
			for(String y: rel.get(x))
			{
				System.out.print(y+" ");
			}
				
			System.out.println();
		}
	}
	
	

}