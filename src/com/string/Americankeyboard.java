package com.string;

import java.util.Scanner;

/*Given a string, return the true if that can be typed using letters of alphabet on only
one row's of American keyboard like the image below.
In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

dad ---> true
mom ---> false

Note: 
1. You may use one character in the keyboard more than once. 
2. You may assume the input string will only contain letters of alphabet.

*/

public class Americankeyboard {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string : ");
		String s = scanner.nextLine();
		String r1 = "qwertyuiop";
		String r2 = "asdfghjkl";
		String r3 = "zxcvbnm";
		int c1 = 0, c2 = 0, c3 = 0;
		int i, j;
		scanner.close();

		for (i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			for (j = 0; j < r1.length(); j++) {
				if (ch == r1.charAt(j))
					c1++;
			}
			for (j = 0; j < r2.length(); j++) {
				if (ch == r2.charAt(j))
					c2++;
			}
			for (j = 0; j < r3.length(); j++) {
				if (ch == r3.charAt(j))
					c3++;
			}
		}

		// using built in method

//		for (i = 0; i < s.length(); i++) {
//			if (r1.indexOf(s.charAt(i)) != -1)
//				c1++;
//			if (r2.indexOf(s.charAt(i)) != -1)
//				c2++;
//			if (r3.indexOf(s.charAt(i)) != -1)
//				c3++;
//		}

		System.out.println(c1 == s.length() || c2 == s.length() || c3 == s.length());

	}
}
