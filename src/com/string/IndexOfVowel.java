package com.string;

import java.util.Scanner;

//create a function that returns the index of first vowel in a string

public class IndexOfVowel {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the line :");
		String s = obj.nextLine();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(i);
				break;
			}

		}
		obj.close();
	}
}