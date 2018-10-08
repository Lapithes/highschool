import java.util.*;
import java.io.*;
public class IntQueueRunner 
{
	public static void main(String []args) throws IOException
	{
		Scanner fs = new Scanner(new File("IntQueue.txt"));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(fs.hasNextLine())
		{
		    String str = fs.nextLine();
		    String[] temp1 = str.split(" ");
		    
		    int [] temp2 = new int[temp1.length];
		
		    for(int x=0; x<temp1.length; x++)
		    {
		    	temp2[x]=Integer.parseInt(temp1[x]);
		    }
		
		    for(int y=0; y<temp2.length; y++)
		    {
		    	list.add(temp2[y]);
		    }
		
		    IntQueue q = new IntQueue(list);
		    System.out.println(q.toString());
		
		    while(!q.isEmpty())
		    {
		    	System.out.println(q.remove());
		    	
		    	if(!q.isEmpty())
		    	{
		    		System.out.println(q.peek());
		    	}
		    		
		    	if(!q.isEmpty())
		    	{
		    		System.out.println(q.remove());
		    	}
		    		
		    }
		
		    System.out.println(q.toString());
		
		}
		fs.close();
	}

}