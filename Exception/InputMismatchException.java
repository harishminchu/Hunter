package com.nth.test;

import java.util.Scanner;

public class InputMismatchException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println(scanner.nextInt());
			
			
			
		} catch (Exception e) {
			System.out.println("InputMismatchException is caught "+e);
		}
		
		
		
	}

}
