import java.io.*;
import java.util.*;
public class SpanRunner 
{
	public static void main( String args[] ) throws IOException 
	{ 
		Scanner fs = new Scanner(new File("spantoeng.dat"));
		SpanishToEnglish test = new SpanishToEnglish(fs);
	
	}
}