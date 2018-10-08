import java.util.*;
class PartList
{
        public Set<String> set1 = new TreeSet();
        public Map<String, Integer> map1 = new TreeMap<String, Integer>();
        
        public String str;

        public PartList(String line)
        {
        	str = line;
        }
        
        public void input()
        {
                String[] strArr = str.split("/");
                
                for(int x=0; x < strArr.length; x++)
                {
                        String s = strArr[x];
                        String[] arr = s.split(" ");
                        
                        s = "";
                        
                        for(int x1 = arr.length-3; x1 < arr.length; x1++)
                        {
                             s += arr[x1] + " ";
                        }
                
                        s += "";
                        
                        for(int x1=0; x1 < arr.length-3; x1++)
                        {
                             s += arr[x1] + " ";
                        }
                        
                        if(set1.add(s) == false)
                        {
                             map1.put(s,map1.get(s)+1);
                        }
                        
                        else
                        {
                             map1.put(s, 1);
                             set1.add(s);
                        }
                }
        }
        
        public void print()
        {
                Iterator it = set1.iterator();
                
                String result = "";
        
                for(int x = 0; x < map1.size(); x++)
                {
                        String str = (String)it.next();
                        result += str + "- " + map1.get(str) + "\n";
                }
                System.out.println(result);
        }
}