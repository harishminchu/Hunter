package com.nth.test;

public class NumberTriangel {
	public static void main(String[] args) {

		// 12 program output list of string value
		Alphabet alphabet = new Alphabet();

		Integer userInput = 5;

	
		// 13 pyramid numbers

		int space = userInput;

		boolean zeroSpace = true;

		for (int outerLopp = 0; outerLopp <= userInput; outerLopp++) {

			for (int j = 1; j <= space; j++) {

				System.out.print(" "); //  no of space before the no start
			}

			for (int j = 1; j <= outerLopp; j++) {

				System.out.print(outerLopp); // values of outer
				System.out.print(" "); // space added between no

			}

			System.out.println();

			if (space == 0)// Checking zero space 
				zeroSpace = false;

			space = zeroSpace ? space - 1 : 0;

		}

		System.out.println("---End of program");

	

		
	}
}
