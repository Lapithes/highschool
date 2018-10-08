import java.util.*;

class BasicsMethod 
{
        Scanner fs;
        public Stack<String> stack;

        public BasicsMethod(String str) 
        {
                fs = new Scanner(str);
                
                stack = new Stack<>();
        }

        public void build() 
        {
                while(fs.hasNext()) 
                {
                        stack.push(fs.next());
                }

        }

        public void print() 
        {
                System.out.println(stack);
                System.out.println();
                System.out.println("popping all items from the stack");
                
                while(!stack.isEmpty()) {

                        System.out.print(stack.pop()+ " ");
                }
                System.out.println("\n");
        }
}
