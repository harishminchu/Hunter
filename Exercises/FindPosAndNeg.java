package com.nth.test;

import java.io.File;
import java.util.Scanner;

public class FindPosAndNeg {

	public static boolean checkPositive(int value) {
		return value > 0 ? true : false;
	}

	public static void main(String[] args) throws Exception {

		int positiveCount = 0;
		int negativeCount = -1;
		boolean status = true;

		Scanner scanner = new Scanner(new File(
				"C:/Users/Toshiba/Downloads/arraydata.txt"));
		while (scanner.hasNextLine()) {

			Integer line = scanner.nextInt();
			if (checkPositive(line) && status) {

				positiveCount = positiveCount + 1;

			} else {
				status = false;
				negativeCount = negativeCount + 1;
			}
		}

		System.out.println("Positive Count  before negative" + positiveCount
				+ "after Negative value Count " + negativeCount);

	}

}
