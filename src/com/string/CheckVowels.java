package com.string;

import java.util.Scanner;

/*Create a function that takes a string and returns the number of vowels contained within it.
*/
public class CheckVowels {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String str = obj.nextLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.print("No of vowels : " + count);
		obj.close();
	}

}
