import java.util.*;
import java.io.*;

class PalindromeRunner {
    public static void main(String[] args) throws IOException 
    {
        Scanner fs = new Scanner(new File("PalinList.txt"));
        
        Palindrome pal;

        while(fs.hasNextLine())
        {
            pal = new Palindrome(fs.nextLine());
            
            pal.print(pal.palind());
        }
        
        fs.close();


    }
}