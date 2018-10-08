import java.util.*;
public class SyntaxChecker {
	Stack<Character> syntax1;
	String expression;
	char[] newArr;
	
	public SyntaxChecker(String in)
	{
		syntax1 = new Stack<Character>();
		expression = in;
		String str = "";
		char[] temp = in.toCharArray();
		for(char c: temp)
		{
			if(c == '{' || c == '(' || c == '<' || c == '[' || c == '}' || c == ')' || c == '>' || c == ']' )
			{
				str += c;
			}
		}
	    newArr = str.toCharArray();
		
	}
	
	public String check()
	{
		boolean correct = true;
		int count1 = 0;
		int count2 = 0;
		for(char c: newArr)
		{
			if(c == '}' || c == ')' || c == '>' || c == ']')
			{
				count1++;
			}
			else if(c == '{' || c == '(' || c == '<' || c == '[')
			{
				count2++;
			}
		}
		
		if(count1 == count2)
		{
			for(char c: newArr)
			{
				if(c == '{' || c == '(' || c == '<' || c == '[')
				{
					syntax1.push(c);
				}
				else if(c == '}')
				{
					char top = syntax1.pop();
					if(!(top == '{'))
					{
						correct = false;
						break;
					}
				}
				else if(c == ')')
				{
					char top = syntax1.pop();
					if(!(top == '('))
					{
						correct = false;
						break;
					}
				}
				else if(c == '>')
				{
					char top = syntax1.pop();
					if(!(top == '<'))
					{
						correct = false;
						break;
					}
				}
				else if(c == ']')
				{
					char top = syntax1.pop();
					if(!(top == '['))
					{
						correct = false;
						break;
					}
				}
			}
			
		}
		else
		{
			correct = false;
		}

		
		if(correct == true)
		{
			return "correct";
		}
		else
		{
			return "incorrect";
		}
	}

}
