package com.nth.test;

import java.util.ArrayList;
import java.util.List;

public class Alphabet {

	List<Character> alphabets ;
	
	public List<Character> getAlphabetList(){
		
		alphabets = new ArrayList<Character>();
		
		char a= 'a';
		char b= 'b';
		char c= 'c';
		char d= 'd';
		char e= 'e';
		char f= 'f';
		char g= 'g';
		char h= 'h';
		char i= 'i';
		char j= 'j';
		char k= 'k';
		char l= 'l';
		
		
		
		alphabets.add(a);
		alphabets.add(b);
		alphabets.add(c);
		alphabets.add(d);
		alphabets.add(e);
		alphabets.add(f);
		alphabets.add(g);
		alphabets.add(h);
		alphabets.add(i);
		alphabets.add(j);
		alphabets.add(k);
		alphabets.add(l);
		return alphabets;
	}
	
	public static void main(String[] args) {

		// 12 program output list of string value
		Alphabet alphabet = new Alphabet();

		Integer userInput = 5;

		for (int outerLopp = 0; outerLopp < userInput; outerLopp++) {

			System.out.print(alphabet.getAlphabetList().get(outerLopp)); // get the value which is present in the index of alphabets 
			if (outerLopp != 0) {

				for (int j = 1; j <= outerLopp; j++) {
					System.out.print(alphabet.getAlphabetList().get(outerLopp + j));
				}

			}

			System.out.println();
		}
	}
}
