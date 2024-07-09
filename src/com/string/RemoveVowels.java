package com.string;

import java.util.Scanner;

/*LBP69: Remove Every vowel from a String
Create a function that takes a string and returns a new string with all vowels removed. 
*/
public class RemoveVowels {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the line");
		String s = scanner.next();
		scanner.close();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				System.out.print(ch);
			}
		}
	}

}
