import java.util.*;
public class PrefixSolver {
	
	String[] expression;
	Stack<Double> calculation;

	public PrefixSolver(String str)
	{
		expression = str.split(" ");
		calculation = new Stack<>();
	}
	
	public double getResult()
	{
		for(int x=expression.length-1; x>-1; x--)
		{
			if(expression[x].equals("+")||expression[x].equals("-")||expression[x].equals("*")||expression[x].equals("/"))
			{
				calculation.push(calculate(expression[x], calculation.pop(), calculation.pop()));
			}
			else
			{
				calculation.push(Double.parseDouble(expression[x]));
			}
		}
		
		return calculation.pop();
	}
	
	public double calculate(String op, double num1, double num2)
	{
		if(op.equals("+"))
		{
			return num2+num1;
		}
		
		else if(op.equals("-"))
		{
			return num2-num1;
		}
		
		else if(op.equals("*"))
		{
			return num2*num1;
		}
		
		else
		{
			return num2/num1;
		}
	}
}