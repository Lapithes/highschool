import java.util.*;
class JavaLinkedList {
		
	int smallest, largest;
	
    double sum, average;
        
    LinkedList<Integer> list;

        public JavaLinkedList(int[] arr)
        {
                list = new LinkedList<>();
                
                largest = Integer.MIN_VALUE;
                smallest = Integer.MAX_VALUE;
                
                double addition = 0;

                for(int x = 0; x<arr.length; x++) 
                {
                        list.add(arr[x]);
                }

                for(int x = 0; x<list.size(); x++) 
                {
                        if(list.get(x) < smallest)
                        {
                        	smallest = list.get(x);
                        }
                                
                        if(list.get(x) > largest)
                        {
                        	largest = list.get(x);
                        }
                                
                        addition += list.get(x);
                }

                sum = addition;
                
                average = (addition/list.size());
        }

        public String toString() 
        {
                return ("SUM:: "+sum+"\nAVERAGE:: "+average+"\nSMALLEST:: "+smallest+"\nLARGEST:: "+largest+"\n");
        }
}