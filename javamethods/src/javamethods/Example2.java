package javamethods;

public class Example2 {
	
	
//create a method 
	public static int square(int num) {    //Method Returntype
		
		//return statement
		return num*num;
	}
	public static void main(String[] args) {
	    int result;

	    // call the method
	    // store returned value to result
	    result = square(15);

	    System.out.println("Squared value of 15 is: " + result);

	}

}
