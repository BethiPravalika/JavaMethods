package List;

import java.util.Iterator;
import java.util.Vector;

public class Listvector {

	public static void main(String[] args) {

Vector<String>vec=new Vector<>();
Vector<Integer>vec1=new Vector<>();
vec.add("Teju");
vec.add("Pavani");
vec.add("Pravalika");
vec.add("Sanvitha");
vec.add("Ravali");
vec.add(4,"Teju");
System.out.println("adding element" +vec.add("Nisha"));
System.out.println("adding" +vec.addAll(vec));
System.out.println("finding size" +vec.size());
System.out.println("finding position" +vec.indexOf("Teju"));
System.out.println("finding position" +vec.lastIndexOf("Teju"));

Iterator itr=vec.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
