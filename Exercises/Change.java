package com.nth.test;

import java.util.Scanner;

public class Change {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the change");
		int temp = 0;
		int change = scanner.nextInt();

		int quaterReminde  = change/25;
	
		change =change- (quaterReminde*25);
		int dimes = change/10;
		change = change - (dimes*10);
		int nickel = change/5;
		change = change- (5*nickel);
		
		System.out.println(quaterReminde+"quater"+dimes+"dimes"+nickel+"nickel"+change+"pennis");
		
	}

}
