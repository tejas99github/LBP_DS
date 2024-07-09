package com.array.self;

import java.util.Scanner;

/*LBP197 : Backspace String Compare
Two strings are said to the same if they are of the same length and have the same character at each index. Backspacing in a string removes the previous character in the string.
Given two strings containing lowercase english letters and the character '#' which represents a backspace key. determine if the two final strings are equal or not. Return 1 if they are equal else 0.
input -----> two strings s1 and s2
con -------> no
output ----> 1 or 0
*/
public class Backspace_String_Compare {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter string s1 : ");
		String s1 = obj.nextLine();
		System.out.println("Enter string s2 : ");
		String s2 = obj.nextLine();

		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();

		for (int i = 0; i < s1.length() - 1; i++) {
			if (s1.charAt(i) != '#' && s1.charAt(i + 1) != '#')
				sb1.append(s1.charAt(i));
		}

		for (int i = 0; i < s2.length() - 1; i++) {
			if (s2.charAt(i) != '#' && s2.charAt(i + 1) != '#')
				sb2.append(s2.charAt(i));
		}

		System.out.println((sb1.toString()).equals(sb2.toString()) ? 1 : 0);
		obj.close();
	}

}
