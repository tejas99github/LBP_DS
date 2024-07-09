package com.string;

import java.util.Scanner;

/*Someone has attempted to censor my strings by replacing every vowel with a *, l*k* th*s. 
Luckily, I've been able to find the vowels that were removed.
Given a censored string and a string of the censored vowels, return the original uncensored string.

w*lc*m*,eoe ====> welcome
*/
public class Censored_String {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the censored String  : ");
		String s1 = obj.next();
		System.out.println("Enter the censored vowels  : ");
		String s2 = obj.next();
		int j = 0;
		System.out.println("Unsensored String below : ");
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == '*') {
				System.out.print(s2.charAt(j++));
			} else {
				System.out.print(s1.charAt(i));
			}
		}
		obj.close();
	}

}
