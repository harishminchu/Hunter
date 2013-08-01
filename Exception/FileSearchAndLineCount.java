package com.nth.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileSearchAndLineCount  {

	public static int appenedFileCount(File file) throws FileNotFoundException {

		Integer count = 0;
		Integer extra = 0;
		Integer startextra = 0;
		Scanner scanner = new Scanner(file);
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
		System.out.println("Number Of  Line in file  "+file.getName()+
				 " count " +(count - extra - startextra));
		System.out.println();
		return  (count - extra - startextra);
	}

	public static int countFilesInDirectory(File directory) throws FileNotFoundException {
		int count = 0;
		int fileCount = 0;
		
		for (File file : directory.listFiles()) {
			if (file.isFile() && file.getName().contains(".java")) {
				count = count +appenedFileCount(file);
				fileCount++;
			}
			if (file.isDirectory()) {
				count += countFilesInDirectory(file);
			}
		}
		System.out.println("*file count "+directory.getName()+" - "+fileCount);
		return count;
	}

	public static void main(String[] args) {

		int Value = 0;
		try {
			Value = countFilesInDirectory(new File("D:\\Users\\Toshiba\\trial\\Try\\src\\main\\java"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Total Number of code Line  "+Value);

	}

}