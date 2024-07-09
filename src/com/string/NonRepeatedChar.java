package com.string;

import java.util.Scanner;

/*first non-repeated character
Program to find first non-repeated character
india ----> nda ---> n
indian ---> da ----> d*/

public class NonRepeatedChar {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a line ");
		String s = obj.nextLine();
		obj.close();
		int i, j, u;
		for (i = 0; i < s.length(); i++) {
			u = 1;

			/*
			 * Check for Repeated Characters: If the character at index i matches any other
			 * character in the string at index j and i is not equal to j, it means the
			 * character is repeated. In such cases, the flag u is set to 0 indicating that
			 * the character is repeated, and the inner loop is terminated using break.
			 */
			for (j = 0; j < s.length(); j++) {
				if (i != j && s.charAt(i) == s.charAt(j)) {
					u = 0;
					break;
				}
			}
			if (u == 1) {
				System.out.println(s.charAt(i));
				break;
			}
		}

	}

}
