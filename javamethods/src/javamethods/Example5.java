package javamethods;

public class Example5 {

	
	  // method defined
	  private static int getSquare(int num){
	    return num * num;
	  }

	public static void main(String[] args) {
	    for (int i = 1; i <= 9; i++) {

	        // method call
	        int result = getSquare(i);
	        System.out.println("Square of " + i + " is: " + result);
	      }
}
}
