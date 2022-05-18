package com.Classandobject;



/**
 * class:
 * =====
 * 
 * object:
 * ======
 *
 */

public class Customer 
{
    //Generally class contains state(variables) and behavior(methods)
	
	//state(variables/Fields)
	int customerId = 4567;
	String customerName = "Pravalika";
	String customerAddress = "Siddipet";
	
	//behavior(methods)
	public void getcustomerDetails()
	{
		System.out.println(customerId);
		System.out.println(customerName);
		System.out.println(customerAddress);
	}
	
	public static void main(String[] args)
	{
		
		Customer customer1 = new Customer();
		
		Customer customer2 = new Customer();
		
		
		/*
		 * System.out.println(customer1.hashCode());
		 * System.out.println(customer2.hashCode());
		 */
		
		customer1.getcustomerDetails();
		System.out.println("====================");
		customer2.getcustomerDetails();
		
		
		
	}

}
