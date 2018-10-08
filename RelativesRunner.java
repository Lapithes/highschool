import java.util.*;
import java.io.*;
class RelativesRunner 
{
	public static void main(String[] args) throws IOException
	{
		Scanner fs = new Scanner(new File("relatives.dat"));
		
		Relatives relatives = new Relatives();
		
		int size = fs.nextInt();
		
		for(int x=0; x<size; x++)
		{
			String str1 = fs.next();
			String str2 = fs.next();
			
			relatives.add(str1, str2);
		}
		relatives.print();
		
		
		System.out.println();
		
		while(fs.hasNext())
		{
    		String str = fs.next();
    		relatives.out(str);
		}
	}
}