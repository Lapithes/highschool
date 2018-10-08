import java.util.*;
import java.io.*;

class Basics {

        public static void main(String args[]) throws IOException 
        {
                Scanner fs = new Scanner(new File("StackBasic.txt"));
                
                while(fs.hasNext()) 
                {
                        BasicsMethod basic = new BasicsMethod(fs.nextLine());
                        basic.build();
                        basic.print();
                }
                
                fs.close();
        }

}