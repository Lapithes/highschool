import java.util.*;
import java.io.*;
class PartsRunner
{
        public static void main(String[] args)throws IOException
        {
                Scanner fs = new Scanner(new File("partinfo.dat"));
                String temp = "";
                
                while(fs.hasNext())
                {
                        temp += fs.nextLine() + "/";
                }
                
                PartList auto = new PartList(temp);
                
                auto.input();
                auto.print();
                
                fs.close();
        }
}