package com.nth.test;

public class Series {

	public static void main(String args[]) {

		int input = 7;

		Double double1 = null;

		for (int i = 1; i <= input; i++) {

			double1 = (double) (1 + (1 / ((2 * i) + 1)));

		}

		System.out.println(double1);

	}

}
