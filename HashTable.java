import java.util.*;
public class HashTable {

	LinkedList<Number>[] list;
	public HashTable()
	{
		list = new LinkedList[10];
		
		for(int x=0; x<10; x++)
		{
			list[x] = new LinkedList<Number>();
		}
	}
	
	public void addNum(Number x)
	{
		boolean contains = false;
		for(Number n: list[x.hashCode()])
		{	
			if(x.equals(n))
			{
				contains = true;
				break;
			}
		}
		
		if(contains == false)
		{
			list[x.hashCode()].add(x);
		}
		
	}
	
	public String toString()
	{
		String str ="";
		str += "HASHTABLE\n";
		for(int x=0; x<list.length; x++)
		{
			str += "Bucket "+x+" ";
			for(int y=0; y<list[x].size(); y++)
			{
				str += list[x].get(y).toString()+" ";
			}
			str += "\n";
			
		}
		return str;
	}
}
