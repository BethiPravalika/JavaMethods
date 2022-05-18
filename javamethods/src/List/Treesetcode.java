package List;

import java.util.TreeSet;

public class Treesetcode {

	public static void main(String[] args) {


		TreeSet<String> s =new TreeSet<String>();
		s.add("Ayesha");
		s.add("Teju");
		s.add("NIharika");
		s.add("Pavani");
		System.out.println("Elements: " +s);
		System.out.println("First Element: "+s.first());
		System.out.println("Last Element: "+s.last());
		System.out.println("Remove First Element:  "+s.pollFirst());
		System.out.println("Elements: "+s);
		System.out.println("Higher Element:  "+s.higher("Ayesha"));
		System.out.println("LOwer Element: "+s.lower("Teju"));
		System.out.println("Descending Elements: "+s.descendingSet());
        System.out.println("Remove Element: "+s.remove("Pavani"));
        System.out.println("Elements: "+s);
        System.out.println("Add Element: "+s.add("Nisha"));
        System.out.println("Elements: "+s);
	}

}
