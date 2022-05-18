package com.methods;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {

		/*
		 *  Write a java program to print learner information 
		 *  (id,name,age and address)
		 */
		
		int learnerid=17522;
		String learnername="Pravalika";
		int learnerage=24;
		String learneraddress="Hyderabad";
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter learner id: ");
		learnerid=scanner.nextInt();
		
		System.out.println("Enter learner name:");
		//learnername=scanner.nextInt()

		System.out.println("Enter learner age:");
		learnerage=scanner.nextInt();

		System.out.println("Enter learner address:");
		//learneraddress=scanner.nextInt();

		System.out.println("================");
		
		System.out.print(" learner id");
         System.out.println(learnerid);
         
		System.out.print(" learner name");
        System.out.println(learnername);

		System.out.print(" learner age");
		System.out.println( learnerage);

		System.out.print("learner address");
		System.out.println(learneraddress);

		
	}

}
