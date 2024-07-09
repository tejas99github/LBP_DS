package com.string;

/*Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.

*/
import java.util.Scanner;

public class ShiftRotateString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s1 = scanner.next();
		System.out.println("Enter goal to be search : ");
		String s2 = scanner.next();
		String s3 = "";
		scanner.close();

		s3 += s1 + s1; // Concatenate s1 to itself: s3 = s1 + s1

		int j = 0;
		int c = 0;
		for (int i = 0; i < s3.length(); i++) {
			if (j < s2.length() && s3.charAt(i) == s2.charAt(j)) {
				c++;
				j++;
			}
		}

		System.out.println((c == s2.length()) ? "true" : "false");
	}
}
