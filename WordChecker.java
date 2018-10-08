import static java.lang.System.*;
import java.io.*;
import java.util.Scanner;

public class WordChecker
{
	public static void main(String[] args) throws IOException
	{
		Scanner input = new Scanner(new File("WordChecker.txt"));
		
		int x = input.nextInt();
		while(x>0)
		{
			x--;
			DoubleList test = new DoubleList();
			input.nextLine();
			String[] list = input.nextLine().split(" ");
			for(String k:list)
				test.add(k);
			System.out.println("The Double Linked List");
			System.out.println(test);
			String word = test.getWord(input.nextInt());
			out.println("Removing "+word);
			while(test.remove(word)>0);
			out.println("The New Double Linked List");
			out.println(test);
			out.println();
		}
	}
}