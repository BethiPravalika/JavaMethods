package List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedHashSet {

	public static void main(String[] args) {


		 //Creating HashSet and adding elements  
        LinkedList set=new LinkedList();  
               set.add("One");    
               set.add("Two");    
               set.add("Three");   
               set.add("Four");  
               set.add("Five");  
               Iterator<String> i=set.iterator();  
               while(i.hasNext())  
               {  
               System.out.println(i.next());  
               }  
	}

}
