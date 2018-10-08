import java.util.*;

public class Acronyms {
	
	private TreeMap<String,String> acronyms;
	private ArrayList<ArrayList<String>> words;
	
	public Acronyms( ArrayList<String> list, ArrayList<ArrayList<String>>strs)
	{
		acronyms = new TreeMap<String,String>();
		
		for(int x = 0;x<list.size();x+=2)
		{
			acronyms.put(list.get(x), list.get(x+1));
		}
		words = strs;
	}
	public String get()
	{
		return words.toString();
	}
	
	public String getSentMap()
	{
		String result = acronyms.toString();
		result = result.replaceAll(",","\n");
		
		return result;
	}
	
	
	public String getSentences()
	{
		String result = "";
		String word = "";
		
		Set<String> keys = acronyms.keySet();
		for(int x = 0;x<words.size();x++)
		{
			for(int y = 0;y<words.get(x).size();y++)
			{
				word = words.get(x).get(y);
				if(word.contains("."))
				{
					word=word.substring(0,word.indexOf("."));
					if(keys.contains(word))
					{
						word = acronyms.get(word);
					}
						
					result+= word + ". ";
					if( word.equals("sir"))
					{
						result+="";
					}
					    
					else
					{
						 result+="\n";
					}
					   
				}
				else if(word.contains(","))
				{
				    word=word.substring(0,word.indexOf(","));
					if(keys.contains(word))
					{
						word = acronyms.get(word);
					}
						
					result+= word + ", ";
					if( word.equals("me"))
					{
						result +="";
					}
					    
					else
					{
						result +="\n";
					}
					    
				}
				else if(word.contains("?"))
				{
				    word=word.substring(0,word.indexOf("?"));
					if(keys.contains(word))
					{
						word = acronyms.get(word);
					}
						
					result += word + "? \n";
				}
				else if(keys.contains(word))
				{
					result += acronyms.get(word) + " ";
				}
					
				else 
				{
					result += words.get(x).get(y) + " ";
				}
					
			}
		}
			
		return result;
	}
}