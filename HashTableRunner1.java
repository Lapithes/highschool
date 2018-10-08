import java.util.*;
import java.io.*;
public class HashTableRunner1 {

	public static void main(String[] args) throws IOException{
		
		Scanner fs = new Scanner(new File("numbers.dat"));
		
		HashTable hash = new HashTable();
		
		int length = Integer.parseInt(fs.nextLine());
		for(int x=0; x<length; x++)
		{
			Number num = new Number(Integer.parseInt(fs.nextLine()));
			hash.addNum(num);
		}
		
		System.out.print(hash.toString());
		
	}

}
