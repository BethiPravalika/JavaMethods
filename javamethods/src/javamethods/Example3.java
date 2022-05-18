package javamethods;

public class Example3 {
	
	//method with no parameter 
	public void display1() {
		System.out.println("Method without parameter");
	}
	
	//Method with single parameter
	public void display2(int a) {
		System.out.println("Method with single parameter: " +a);
	}
	public static void main(String[] args) {
		
		//create an object of Example3
		Example3 obj = new Example3();
		
		//calling method with no parameters
		obj.display1();
		//calling with single parameters
		obj.display2(45);

	}

}
