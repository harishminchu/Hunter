package com.nth.test;

import java.util.Scanner;

public class XpowerN {

	 public static double power(double base, double basePow)
	    {
	         
	        if(basePow==0)
	        {
	            return 1;
	        }
	        else if(basePow==1)
	        {
	            return base;
	        }
	        else if(basePow>1)
	        {
	            return base*power(base,basePow-1);
	        }
	        else
	        {
	 
	              return 1/power(base, -1 * basePow);
	        }
	        
	        
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);
		 
	      System.out.print("Enter the base number: ");
	      double base = input.nextInt();
	 
	      System.out.print("Enter the base power: ");
	      double basePow = input.nextInt();
	 
	       
	      XpowerN access = new XpowerN();
	       
	      System.out.print(base + " to the power of " + basePow + " is: " + access.power(base, basePow));
		
		
		
	}

}
