package com.nth.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			Integer count = 0;
			Integer extra = 0;
			Integer startextra = 0;
			Scanner scanner = new Scanner(new File(
					"C:/Users/Toshiba/Downloads/football.dat"));

			while (scanner.hasNext()) {

				String string = scanner.nextLine().trim();

				if ((string.contains("/**") || string.contains("/*")
						|| string.contains("//") || string.trim().isEmpty())) {

					// System.out.println(string);
					extra = extra + 1;
					// System.out.println(extra);
				}
				if (string.startsWith("*")) {

					// System.out.println(string);
					startextra = startextra + 1;

					// System.out.println("star "+startextra);
				}

				count = count + 1;

			}
			System.out.println("Number Of  Line in file  "
					+ (count - extra - startextra));
			System.out.println();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
