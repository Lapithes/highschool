import java.util.*;

public class IntQueue 
{
	 private ArrayList<Integer> numList;

	   public IntQueue(ArrayList<Integer> list)
	   {
		   numList = list;
	   }

	   public void add(int n)
	   {
		   if(!isEmpty())
		   {
			   numList.add(0,n);
		   }
			   
	   }

	   
	   public int peek()
	   {
		   if(!isEmpty())
		   {
			   return numList.get(0);
		   }
			   
		   return 0;
	   }
	   
	   public boolean isEmpty()
	   {
		   if(numList.size()==0)
		   {
			   return true;
		   }
			   
		   return false;
	   }
	   
	   public int remove()
	   {
		   if(!isEmpty())
		   {
			   return numList.remove(0);
		   }
			   
		   return 0;
	   }

	   public String toString()
	   {
		   return numList.toString();
	   }

}
