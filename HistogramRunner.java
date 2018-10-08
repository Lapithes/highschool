import java.util.*;
import java.io.*;
class HistogramRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner fs = new Scanner(new File("histogram.dat"));
		
		while(fs.hasNextLine())
		{
			Histogram hist = new Histogram(fs.nextLine());
			System.out.println(hist);
		}
		
		fs.close();
	}
}