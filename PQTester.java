import java.util.*;
public class PQTester {
	PriorityQueue<String> list;
	
	public PQTester(String str)
	{
		list = new PriorityQueue<String>();
		String[] temp = str.split(" ");
		for(String s: temp)
		{
			list.add(s);
		}
	}
	
	public String getMin()
	{
		return list.peek();
	}
	
	public String getNaturalOrder()
	{
		PriorityQueue<String> temp = list;
		String result = "";
		while(!list.isEmpty())
		{
			result += temp.remove()+" ";
		}
		
		return result;
	}
}
