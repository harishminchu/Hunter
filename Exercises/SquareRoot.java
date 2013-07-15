package com.nth.test;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double userInput = scanner.nextDouble();

		double x = Math.sqrt(userInput);
		System.out.println("The square Root Value of " + x);

		double y = (1 +( x *(0.5))) / 2;
		System.out.println("the guess Value after the second yeild is " + y);
		
		
		System.out.println("ln(x) Value"+Math.log10(2));
	    
		double tr = Math.E;
		System.out.println(tr);
		System.out.println(Math.pow(tr, 2));
		double degrees = 45.0;
	     double radians = Math.toRadians(degrees);

	    
	     System.out.format("The arcsine of %.4f is %.4f degrees %n",
	                     Math.sin(radians),
	                     Math.toDegrees(Math.asin(Math.sin(radians))));
		
	}

}
