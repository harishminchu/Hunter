package com.nth.test;

public class Am {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num, rem, qub, sum = 0, i;
		System.out.println("Armstrong numbers between 1 to 999 are: ");

		for (i = 1; i <= 999; i++) {
			num = i;
			sum = 0;
			while (num > 0) {
				rem = num % 10;
				
				qub = rem * rem * rem;
				sum = sum + qub;
				num = num / 10;
			}
			if (sum == i) {
				System.out.println("output "+sum);
			}
		}

		
		
	}

}
