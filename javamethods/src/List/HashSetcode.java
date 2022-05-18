package List;

import java.util.HashSet;

public class HashSetcode {

	public static void main(String[] args) {

		//creating Hashset and adding elements
		HashSet<String> s = new HashSet<String>();
		s.add("Sanvitha");
		s.add("Ayesha");
		s.add("Teju");
		s.add("Pravalika");
		System.out.println("Object of:  " +s);
		System.out.println("Add Element:  "+s.add("Keerthi"));
		System.out.println("Add Element:  "+s.add("Keerthi"));
		System.out.println("Elements:   " +s);
		

	}

}
