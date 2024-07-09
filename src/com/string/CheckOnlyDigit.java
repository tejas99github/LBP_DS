package com.string;

import java.util.Scanner;

/*Check only digits
Implement a program to check if a string contains only digits.
*/
public class CheckOnlyDigit {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the string ");
		String s = obj.nextLine();
		obj.close();
		int i, c = 0;
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
				c++;
		}
		System.out.println((c == s.length()) ? "Yes" : "No");

	}

}
