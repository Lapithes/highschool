import java.util.*;
import static java.lang.System.*;
import java.io.*;

public class ListFunHouseRunner
{
	public static void main ( String[] args ) throws IOException
	{
		
		Scanner input = new Scanner(new File("ListFunHouse.txt"));
		
		String list[] = input.nextLine().split(" ");
		ListNode z = null;
		for(int i=0; i<list.length; i++)
			z = ListFunHouse.add(z, list[i]);
		out.println("Original list values");	
		ListFunHouse.print(z);
		out.println("num nodes = " + ListFunHouse.nodeCount(z));
		out.println("List values after calling nodeCount");	
		ListFunHouse.print(z);
		ListFunHouse.doubleFirst(z);		
		out.println("List values after calling doubleFirst");							
		ListFunHouse.print(z);
		ListFunHouse.doubleLast(z);		
		out.println("List values after calling doubleLast");							
		ListFunHouse.print(z);
		int x = input.nextInt();
		ListFunHouse.removeXthNode(z,x);		
		out.println("List values after calling removeXthNode("+x+")");					
		ListFunHouse.print(z);
		x = input.nextInt();
		input.nextLine();
		String str = input.next();		
		ListFunHouse.setXthNode(z,x,str);		
		out.println("List values after calling setXthNode("+x+","+str+")");										
		ListFunHouse.print(z);
					
	}
}