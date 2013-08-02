package com.my.test;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleTokenizer {
// this Code does not meet all requriment .


	public static void main(String[] args) throws Exception {
		
		String[] key = {"for","abstract","new","switch","assert","package","synchronized","boolean","break","byte","case","catch","char","class","native","continue","default","do","if","double","else","enum","extends","final","finally","float","private","implements","import","instanceof","int","short","interface","long","super","this","protected","public","return","try","static","strictfp","while","throw","throws","transient","void","volatile"};
		String[] opera = {"=","+","-","/","%","*","++","--","!","==","!=",">",">=","<","<=","&&","||","?:","~","<<",">>",">>>","&","^","|"};
		int keywordCount=0;
		int operatorCount=0;
		List<String> keyList = Arrays.asList(key);
		List<String> operaList = Arrays.asList(opera);
		Pattern pattern = Pattern.compile("[\\w]+[\\s]*([\\w]+)[\\s]*[=]*[\\s]*[\\w]*[;]");
		
		BufferedReader br = new BufferedReader(new FileReader("D:\\Users\\Toshiba\\trial\\Try\\src\\main\\java\\com\\nth\\test\\Person.java"));
	    String nextLine= br.readLine();
	    while(nextLine!=null){
	    	String[] lineArray = nextLine.split("[\\s]+");
	    	for (String string : lineArray) {
				if(keyList.contains(string)){
					keywordCount++;
					System.out.println(string);
				}else if(operaList.contains(string)){
					operatorCount++;
					System.out.println(string);
				} 
			}
	    	Matcher matcher = pattern.matcher(nextLine);
	    	if(matcher.find()){
	    		System.out.println(matcher.group(1));
	    	}
	    	nextLine=br.readLine();
	    }
		
		
	}

}