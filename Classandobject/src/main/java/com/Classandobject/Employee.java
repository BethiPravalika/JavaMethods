package com.Classandobject;


/**
 * class:
 * =====
 * 
 * object:
 * ======
 *
 */

public class Employee 
{
    //Generally class contains state(variables) and behavior(methods)
	
	//state(variables/Fields)
	int employeeId = 3039;
	String employeeName = "Srinivas";
	double employeeSalary = 85753;
	String employeeAddress = "Pune";
	
	//behavior(methods)
	public void getEmployeeDetails()
	{
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(employeeSalary);
		System.out.println(employeeAddress);
	}
	
	public static void main(String[] args)
	{
		
		Employee employee1 = new Employee();
		
		/**
		 * 
		 * From the line 18
		 * 
		 * 'Employee' is a class name
		 * 
		 * 'employee1' is an object reference
		 * 
		 * '=' assignment operator
		 * 
		 * 'new': it is keyword, used to allocate memory(in RAM(heap)) to the object
		 * 
		 * 'Employee()': is a constructor, use to initialize object
		 * 
		 */
		
		//System.out.println(employee1.hashCode());
		
		employee1.getEmployeeDetails();
		
	}

}
