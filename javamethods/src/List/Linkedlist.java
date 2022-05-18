package List;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {

		  
		  LinkedList<String> al=new LinkedList<String>();  
		  al.add("Sree");  
		  al.add("Srinivas");  
		  al.add("Ammu");  
		  al.add("Amma");  
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
	}

	}
}
