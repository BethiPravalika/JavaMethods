package List;

import java.util.Iterator;
import java.util.Stack;

public class stack {

	public static void main(String[] args) {

		Stack<Integer> Stack1= new Stack<Integer>();  
        Stack1.push(22);
        Stack1.push(78);  
        Stack1.push(113);  
        Stack1.push(90);  
        Stack1.push(120);  
		System.out.println("Stack Element: " +Stack1);
		System.out.println("Add Element: " +Stack1.push(2));
		System.out.println("Stack Element: " +Stack1);
		System.out.println("Peek Element: " +Stack1.peek());
		System.out.println("Search Element: " +Stack1.search(25));
		System.out.println("Delete Element: " +Stack1.pop());
         Iterator  itr=Stack1.iterator();
         while(itr.hasNext()) {
        	 System.out.println(itr.next());
         }


		}  
	}

