package com.string;

import java.util.Scanner;

/*Number of vowels
Implement a program to return number of vowels present in the given string
*/
public class CountOfVowels {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a line : ");
		String s = obj.nextLine();
		obj.close();
		int i, c = 0;
		for (i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				c++;
		}
		System.out.println(c);

	}

}
