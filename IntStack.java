import java.util.*;

class IntStack
{
   public ArrayList<Integer> list;

   public IntStack()
   {
		list = new ArrayList<Integer>();
   }
 
   public int pop()
   {
	   	int num = list.get(list.size()-1);
	   	
	   	list.remove(list.size()-1);
	   	
		return num;
   }
   
   public void push(int in)
   {
		list.add(in);
   }

   public boolean isEmpty()
   {
   		if(list.isEmpty())
   		{
   			return true;
   		}
   		
   		return false;
 	
   }

   public int peek()
   {
	   int num = list.get(list.size()-1);
	   return num;
	   
   }

   public String toString()
   {
   		String result ="[";
   		
   		for(int x=0; x<list.size(); x++)
   		{
   			if(x<list.size()-1)
   			{
   				result += list.get(x) + ", ";
   			}
   			
   			else
   			{
   				result += list.get(x);
   			}
   		}
   		
   		result += "]";
   		
   		return result;
   }
}