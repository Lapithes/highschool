import java.util.*;
import java.io.*;
class JavaLinkedListRunner {

	public static void main(String[] args) throws IOException
	{
		Scanner fs = new Scanner(new File("JavaLinkedList.txt"));
		
		while(fs.hasNextLine())
		{
			String[] str = fs.nextLine().split(" ");
			
			int[] intArr = new int[str.length];
			
			for(int x=0; x<intArr.length; x++)
			{
				intArr[x] = Integer.parseInt(str[x]);
			}
			
			JavaLinkedList list = new JavaLinkedList(intArr);
			
			System.out.println(list.toString());
			
		}
		
		fs.close();
	}
}
