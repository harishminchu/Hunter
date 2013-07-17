package com.nth.test;

public class SquareCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Alphabet alphabet = new Alphabet();

		Integer userInput = 5;

	
		// 13 pyramid numbers

	
		// 14 square the characters

		for (int ouuterLoop = 0; ouuterLoop <= userInput; ouuterLoop++) {

			if (ouuterLoop == 0 || ouuterLoop == userInput) {
				for (int innerLopp = 0; innerLopp <= userInput; innerLopp++) {

					System.out.print(alphabet.getAlphabetList().get(innerLopp));
				}
			} else {
				System.out.print("a");
				System.out.print(" ");
				System.out.print(" ");
				System.out.print(" ");
				System.out.print(" ");
				System.out.print("f");
			}

			System.out.println("  ");

		}
		
	}

}
