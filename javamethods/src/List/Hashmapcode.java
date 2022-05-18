package List;

import java.util.HashMap;

public class Hashmapcode {

	public static void main(String[] args) {


		HashMap<Integer,String> s=new HashMap<Integer,String>();
		s.put(1, "Yamini");
		s.put(1, "Maitrai");
		s.put(1, "Irfana");
		s.put(1, "Keerthi");
        System.out.println("Elements: " +s );
        System.out.println("get values: "+s.get(4));
        System.out.println("Contains Element: " +s.containsKey((2)));
        System.out.println("Replaced Element: "+s.replace(3,"NIsha"));
        System.out.println("Elements: " +s);
        System.out.println("Removed Element: "+s.remove(4));
        System.out.println("Elements: "+s);
        System.out.println("Ifabsent Element: "+s.putIfAbsent(2,"Maitrai"));
        System.out.println("Entryset Element: "+s.entrySet());
        
        
	}

}
