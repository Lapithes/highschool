//Roger Zhong
import java.util.*;
import java.io.*;
public class ExpressionSolverRunner {

	public static void main(String[] args) throws IOException {
		
		Scanner fs = new Scanner(new File("expressionSolver.txt"));
		ExpressionSolver solver = new ExpressionSolver();
		
		while(fs.hasNextLine())
		{
			System.out.println(solver.result(fs.nextLine()));
		}
		
		fs.close();
	}

}
