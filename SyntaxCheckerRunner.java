import java.util.*;
import java.io.*;
public class SyntaxCheckerRunner {

	public static void main(String[] args) throws IOException {
		Scanner fs = new Scanner(new File("SyntaxChecker.txt"));
		
		while(fs.hasNextLine())
		{
			SyntaxChecker checker = new SyntaxChecker(fs.nextLine());
			System.out.println(checker.expression+" is "+checker.check()+".");
			System.out.println();
		}

	}

}
