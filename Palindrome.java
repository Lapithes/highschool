import java.util.*;
class Palindrome
{
    public Stack<String> stack;
    public Queue<String> queue;
    public String words;

    public Palindrome(String s)
    {
        words = s;
        construct();
    }


    public void construct()
    {
        Scanner fs = new Scanner(words);
        
        stack = new Stack<String>();
        queue = new LinkedList<String>();

        while(fs.hasNext())
        {
            String str1 = fs.next();

            stack.push(str1);
            queue.add(str1);

        }
        fs.close();
    }

    public boolean palind()
    {
        for(int x=queue.size()-1; x>-1 ;x--)
        {
            if(!stack.pop().equals(queue.remove()))
            {
                return false;
            }
        }
        return true;
    }

    public void print(boolean x)
    {
        construct();
        System.out.print(queue);

        if(x)
        {
        	 System.out.println(" is a palinlist.");
        }
           
        else
        {
        	System.out.println(" is not a palinlist.");
        }
            

        System.out.println();
    }
}