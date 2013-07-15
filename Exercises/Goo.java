package com.nth.test;

import java.util.Scanner;

public class Goo {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// 1st program

		int overtime = 0;
		int j = 1;
		System.out.print("Enter the Hours for an employee worked above 40 hours : ");
		Scanner scanIn = new Scanner(System.in);
		Integer time = scanIn.nextInt();
		while(j<=time)
		{
		overtime=j*12;
		j++;
		}
		System.out.println("Overtime of the employee is Rs. " + overtime);
		
		
	// 2nd program	
	
	
		  Scanner object = new Scanner(System.in);
		  System.out.println("enter the number");
		  int userInput= object.nextInt();
		  int fact= 1;
		  System.out.println("Factorial of " +userInput+ ":");
		  for (int i= 1; i<=userInput; i++){
		  fact=fact*i; // the n=n*i
		  }
		  System.out.println(fact);
		  }
		  
	
	// 3rd 
	
	
	
	
	}


