import static java.lang.System.*;

public class ListFunHouse
{
	//this method will print the entire list on the screen
   public static void print(ListNode list)
   {
	   ListNode temp = list;
   		while(temp!=null)
   		{
   			out.print(temp.getValue()+" ");
   			temp = temp.getNext();
   		}
   		out.println();
   }		
	
	//this method will return the number of nodes present in list
	public static int nodeCount(ListNode list)
	{
		int count = 0;
		ListNode temp = list;
		while(temp!=null)
		{
			count++;
			temp = temp.getNext();
		}
		return count;
   	
	}

	//this method will create a new node with the same value as the first node and add this
	//new node to the list.  Once finished, the first node will occur twice.
	public static void doubleFirst(ListNode list)
	{
		list.setNext(new ListNode(list.getValue(),list.getNext()));
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public static void doubleLast(ListNode list)
	{
   			ListNode temp = list;
   			while(temp.getNext()!=null)
   			{
   				temp = temp.getNext();
   			}
   			
   			temp.setNext(new ListNode(temp.getValue(),null));
   			
	}
		
	//method skipEveryOther will remove every other node
	public static void skipEveryOther(ListNode list)
	{
		int pos = 1;
		ListNode temp = list;
		
		while(temp!=null)
		{
			if(pos%2==1&&temp.getNext()!=null)
			{
				temp.setNext(temp.getNext().getNext());
			}
			temp = temp.getNext();
			pos++;
		}
	
	}

	//this method will set the value of every xth node in the list
	public static void setXthNode(ListNode list, int x, Comparable value)
	{
		int pos = 1;
		ListNode temp = list;
		
		while(temp!=null)
		{
			if(pos%(x)==0)
			{
				temp.setValue(value);
			}
			temp = temp.getNext();
			pos++;
		}
	
	}	

	//this method will remove every xth node in the list
	public static void removeXthNode(ListNode list, int x)
	{
		
		int pos = 1;
		ListNode temp = list;
		
		while(temp!=null)
		{
			if(pos%(x-1)==0&&temp.getNext()!=null)
			{
				temp.setNext(temp.getNext().getNext());
			}
			temp = temp.getNext();
			pos++;
		}
	
	}
	
	//this method will add a node at the end of the list
	public static ListNode add(ListNode list, Comparable val)
	{
		if(list==null)
		{
			list = new ListNode(val, null);
			return list;
		}
		else
		{
			ListNode temp = list;
			while(temp.getNext()!=null)
			{
				temp = temp.getNext();
			}
			
			temp.setNext(new ListNode(val, null));
			return list;
		}
		
		
	
	}
}