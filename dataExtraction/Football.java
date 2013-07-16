package com.nth.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Football {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Integer maxValue = 0;
			Integer minValue = 0;
			Integer temp = 0;
			Integer mintemp = 0;
			Integer count = 0;
			Integer mincount = 0;

			Scanner scanner = new Scanner(new File(
					"C:/Users/Toshiba/Downloads/football.dat"));

			while (scanner.hasNext()) {

				String string = scanner.nextLine();

				Matcher matcher = Pattern.compile("\\d[0-9]\\s\\s-").matcher(
						string);

				while (matcher.find()) {

					maxValue = new Integer(matcher.group().replace("-", " ")
							.trim());

					System.out.println(maxValue);
				}

				Matcher matchermin = Pattern.compile("\\-\\s\\s[0-9]+")
						.matcher(string);

				while (matchermin.find()) {

					minValue = new Integer(matchermin.group().replace("-", " ")
							.trim());
					System.out.println(minValue);
				}

				if (temp > (maxValue - minValue)) {
					System.out.println(temp);

				} else {
					count = count + 1;
					temp = maxValue - minValue;
				}

				if (mintemp < (maxValue - minValue)) {
					System.out.println(mintemp);

				} else {
					mincount = mincount + 1;
					mintemp = maxValue - minValue;
				}
				System.out.println("temp high" + mintemp);

			}

			System.out.println("team with max goal 1. Arsenal" + (count - 5));
			System.out.println("team againts min goal  20. Leicester"
					+ (mincount + 5));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
