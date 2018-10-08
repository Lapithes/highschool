import java.util.*;
import java.io.*;
public class PQTesterRunner {

	public static void main(String[] args) throws IOException{
		Scanner fs = new Scanner(new File("PQTester.txt"));
		
		while(fs.hasNextLine())
		{
			PQTester queue = new PQTester(fs.nextLine());
			System.out.println("toString() - "+queue.list);
			System.out.println("getMin() - "+queue.getMin());
			System.out.println("getNaturalOrder() - "+queue.getNaturalOrder());
			System.out.println();
		}

	}

}
