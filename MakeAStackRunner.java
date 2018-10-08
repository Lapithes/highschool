import java.util.*;
import java.io.*;

public class MakeAStackRunner
{
	public static void main(String[] args) throws IOException
	{
		IntStack stack = new IntStack();
		
		Scanner fs = new Scanner(new File("IntStack.txt"));
		
		while(fs.hasNext())
		{
			stack.push(fs.nextInt());
		}
		
		System.out.println(stack.toString());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.toString());
		
		fs.close();
		
	}
}