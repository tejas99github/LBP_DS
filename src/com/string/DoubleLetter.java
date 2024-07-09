package com.string;

import java.util.Scanner;

/*LBP67: Double Letters
Create a function that takes a word and returns true if the word has two consecutive identical letters.*/
public class DoubleLetter {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = obj.next();
		int found = 0;
		for (int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				found = 1;
				break;
			}
		}
		System.out.println((found == 1) ? "True" : "False");
		obj.close();
	}

}
