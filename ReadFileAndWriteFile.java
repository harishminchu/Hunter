package com.nth.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileAndWriteFile {

	/**
	 * @param args
	 * 
	 * The link that i refer for scanner class http://docs.oracle.com/javase/1.5.0/docs/api/java/util/Scanner.html
	 * scanner have many useful method than buffer reader 
 	 * 
 	 * This simple code perform both read and write operation on file with two non unique  folders
	 * 
	 **/
	
	public static void main(String[] args) {

		try {
			
			writeFile(readFile(new File("D:\\tools\\read.txt")));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Scanner readFile(File file) throws FileNotFoundException {
		return new Scanner(file);
	}

	public static void  writeFile(Scanner fileRead) throws IOException {
		
		FileWriter fileWriter = new FileWriter(new File("D:\\testing tool\\write.txt"));
		
		while (fileRead.hasNextLine()) {
			
			fileWriter.write(fileRead.nextLine() + "\n");
			
			fileWriter.flush();
			
		}
		
		fileWriter.close();
		
		System.out.println("Write file operation is done ");

	}

}
