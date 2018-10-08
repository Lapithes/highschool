import java.util.*;
import java.io.*;

public class AcroRunner {
	
	public static void main(String []args) throws IOException
	{
		Scanner fs = new Scanner(new File("acro.dat"));
		int count = 0;
	
		Integer s = new Integer(fs.nextLine());
		
		ArrayList<String> raylist1 = new ArrayList<String>();
		
		ArrayList<ArrayList<String>> raylist2 = new ArrayList<ArrayList<String>>();
	
	while(fs.hasNextLine() && count<s)
	{
		String x = fs.nextLine();
		
		raylist1.add(x.substring(0,x.indexOf("-")-1));
		raylist1.add(x.substring(x.indexOf("-")+2));
		
		count++;
	}
	
	while(fs.hasNextLine())
	{
		String x = fs.nextLine();
		ArrayList<String> temp = new ArrayList<String>();
		String[] y = x.split(" ");
		
		for(int z = 0; z<y.length; z++)
		{
			temp.add(y[z]);
		}
		
		raylist2.add(temp);
	}
	
	
	Acronyms nyms = new Acronyms(raylist1,raylist2);
	
	System.out.println("MAP CONTENTS");
	System.out.println(nyms.getSentMap());
	System.out.println("READ LINES");
	System.out.println(nyms.getSentences());
	
}
}