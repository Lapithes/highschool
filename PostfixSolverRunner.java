import java.util.*;
import java.io.*;
public class PrefixSolverRunner {

	public static void main(String[] args)throws IOException {
		
		Scanner fs = new Scanner(new File("PrefixSolver.txt"));
		
		while(fs.hasNextLine())
		{
			String str = fs.nextLine();
			System.out.print(str+" = ");
			PrefixSolver solver = new PrefixSolver(str);
			
			System.out.println(solver.getResult());
		}
		fs.close();

	}

}




