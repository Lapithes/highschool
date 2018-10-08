//Roger Zhong
import java.util.*;
public class ExpressionSolver {
	
	public String result(String expression)
	{
		return expression+" = "+calculate(expression);
	}
	public String calculate(String expression)
	{
		ArrayList<String> simpExpression = new ArrayList<String>();
		String[] splitExpression = expression.split(" ");
		
		for(int x=0; x<splitExpression.length; x++)
		{
			simpExpression.add(splitExpression[x]);
		}
		
		int x = 1;
		
		while(x<simpExpression.size())
		{
			if(simpExpression.get(x).equals("*"))
			{
				simpExpression.add(x-1, Integer.toString(Integer.parseInt(simpExpression.get(x-1))*Integer.parseInt(simpExpression.get(x+1))));
				simpExpression.remove(x);
				simpExpression.remove(x);
				simpExpression.remove(x);
				x--;
			}
			else if(simpExpression.get(x).equals("/"))
			{
				simpExpression.add(x-1, Integer.toString(Integer.parseInt(simpExpression.get(x-1))/Integer.parseInt(simpExpression.get(x+1))));
				simpExpression.remove(x);
				simpExpression.remove(x);
				simpExpression.remove(x);
				x--;
			}
			x++;
		}
		
		x = 1;
		
		while(x<simpExpression.size())
		{
			if(simpExpression.get(x).equals("+"))
			{
				simpExpression.add(x-1, Integer.toString(Integer.parseInt(simpExpression.get(x-1))+Integer.parseInt(simpExpression.get(x+1))));
				simpExpression.remove(x);
				simpExpression.remove(x);
				simpExpression.remove(x);
				x--;
			}
			else if(simpExpression.get(x).equals("-"))
			{
				simpExpression.add(x-1, Integer.toString(Integer.parseInt(simpExpression.get(x-1))-Integer.parseInt(simpExpression.get(x+1))));
				simpExpression.remove(x);
				simpExpression.remove(x);
				simpExpression.remove(x);
				x--;
			}
			x++;
		}
		
		return simpExpression.get(0);
		
	}

}
