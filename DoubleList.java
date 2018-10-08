import static java.lang.System.*;

public class DoubleList
{
	private DoubleNode front,back;
	private int size;

	public DoubleList( )
	{
		front = back = null;
		size = 0;
	}

	//ADDS NEW NODE TO THE BACK OF THE LIST FOR WORD IF IT DOES NOT EXIST.
	//IF IT EXISTS, IT BUMPS UP WORD'S COUNT BY ONE
	public void add(String word)
	{
		if(size==0)
		{
		    front = back = new DoubleNode(word,1,front,back);
		    size++;
		}
		
		else
		{
		    DoubleNode temp = front;
		    
		    int num = size;
		    
		    while(num>0)
		    {
		    	
		    	if(temp.getWord().equals(word))
		    	{
		    		temp.setWordCount(temp.getWordCount()+1);
		    		break;
		    	}
		    	
		    	temp = temp.getNext();
		    	num--;
		    }
		    
		    
		    if(num==0)
		    {
		    	
		    	back.setNext(new DoubleNode(word,1,front,back));
		    	back = back.getNext();
		    	front.setPrev(back);
		    	size++;
		    	
		    }
		    
		    
		}
		    	
		
	}

	//REMOVE ONE COUNT OF THE WORD FROM THE LIST, IF THE COUNT RESULTS IN ZERO
	//REMOVE THE WORD FROM LIST. RETURN THE NEW COUNT OF THE WORD OR ZERO
	//IF THE WORD DOES NOT EXIST IN LIST
	public int remove(String word)
	{
		DoubleNode temp = front;
	    
		int num = size;
		
		if(size == 1)
		{
			if(front.getWordCount()==1)
			{
				front = back = null;
				size--;
				return 0;
			}
			else
			{
				front.setWordCount(front.getWordCount()-1);
				return front.getWordCount();
			}
		}
		
		else
		{
			while(num>0)
		    {
		    	if(temp.getWord().equals(word))
		    	{
		    		if(temp.getWordCount()==1 && temp!=front)
		    		{
		    			temp.getPrev().setNext(temp.getNext());
		    			
		    			temp.getNext().setPrev(temp.getPrev());
		    			size--;
		    			return 0;
		    		}
		    		else if(temp.getWordCount()==1 && temp==front)
		    		{
		    			front.getPrev().setNext(front.getNext());
		    			
		    			front.getNext().setPrev(front.getPrev());
		    			front = front.getNext();
		    			size--;
		    			return 0;
		    		}
		    		else
		    		{
		    			temp.setWordCount(temp.getWordCount()-1);
			    		return temp.getWordCount();
		    		}
		    		
		    	}
		    	
		    	temp = temp.getNext();
		    	num--;
		    }
			return 0;
		}
	}
	
	// WILL RETURN THE WORD AT X. THE FRONT IS CONSIDERED 0. 
	// IF X IS NEGATIVE IT WILL COUNT USING PREVIOUS
	// IF X IS POSITIVE IT WILL COUNT USING NEXT
	public String getWord(int x)
	{
		
		if(x==0)
		{
			return front.getWord();
		}
		else if(x<0)
		{
			DoubleNode temp = back;
			while(x<-1)
			{
				temp = temp.getPrev();
				x++;
			}
			return temp.getWord();
		}
		
		else if(x>0)
		{
			DoubleNode temp = front;
			while(x>0)
			{
				temp = temp.getNext();
				x--;
			}
			return temp.getWord();
		}
		return "";
	}
	
	//OPTIONAL PRIVATE METHOD
	private void removeNode(DoubleNode x, DoubleNode y, DoubleNode z)
	{

	}

	//RETURNS THE SIZE OF THE LIST	
	public int size()
	{
		return size;
	}
	
	//RETURNS IF THE LIST CONTAINS THE WORD IN IT
	public boolean contains(String word)
	{
		return false;
	}
	
	//RETURNS THE LIST AS A BIG STRING
	public String toString()
	{
		String str ="";
		
		DoubleNode temp = front;
		
		int num = size;
		
	    while(num>0)
	    {
	    	str += temp.getWord()+"-"+temp.getWordCount()+" ";
	    	temp = temp.getNext();
	    	num--;
	    }

		return str;
	}
}