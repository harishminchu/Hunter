package com.nth.test;

public class pyramid {

	public static void main(String[] args) {
		//
		Integer num = 5;

		for (int i = 1; i <= num; i++) {

			for (int k = 1; k <= i; k++) {
				System.out.print(i);
				for (int k1 = 1; k1 < k; k1 += k) {

					System.out.print(i);
				}
			}
			System.out.println();
		}

		// 9

		for (int i = 1; i <= num; i++) {

			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
		for (int i = num; i >= 0; i--) {

			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println();

		// 10

		int space = num;

		boolean zeroSpace = true;

		for (int outerLopp = 0; outerLopp <= num; outerLopp++) {

			for (int j = 1; j <= space; j++) {

				System.out.print(" "); // no of space before the no start
			}

			for (int j = 1; j <= outerLopp; j++) {
				
				System.out.print(outerLopp);
				System.out.print(" ");
			}

			System.out.println();

			if (space == 0)// Checking zero space
				zeroSpace = false;

			space = zeroSpace ? space - 1 : 0;

		}

	}

}