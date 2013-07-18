package com.nth.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Football {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Integer maxValue = 0;
			Integer minValue = 0;
			Integer goal = 0;
			Integer mingoal = 0;
			Integer count = 0;
			Integer mincount = 0;
			String tmaxName = "";
			String tminName = "";
			String teamName="";
			Scanner scanner = new Scanner(new File(
					"C:/Users/Toshiba/Downloads/football.dat"));

			while (scanner.hasNext()) {

				String string = scanner.nextLine();
				

				Matcher matcherName = Pattern.compile(".[A-Z][aA-zZ]{4,15}+")
						.matcher(string);

				while (matcherName.find()) {

					teamName = matcherName.group();

				}

				Matcher matcher = Pattern.compile("\\d[0-9]\\s\\s-").matcher(
						string);

				while (matcher.find()) {

					maxValue = new Integer(matcher.group().replace("-", " ")
							.trim());

				}

				Matcher matchermin = Pattern.compile("\\-\\s\\s[0-9]+")
						.matcher(string);

				while (matchermin.find()) {

					minValue = new Integer(matchermin.group().replace("-", " ")
							.trim());

				}

				if (goal < (maxValue - minValue)) {
					
					goal = maxValue - minValue;
					System.out.println(teamName);
					System.out.println("max "+goal);
					tmaxName = teamName;
				} 

				if (mingoal > (maxValue - minValue)) {
					mingoal = maxValue - minValue;
					System.out.println("min "+mingoal);
					System.out.println(teamName);
					tminName = teamName;
				}

			}

			System.out.println("team with max goal " + tmaxName  +" with goal "+ goal);
			System.out.println("team with min goal" + tminName +" with goal "+mingoal);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
