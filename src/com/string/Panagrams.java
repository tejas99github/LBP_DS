package com.string;

/*Implement a program to check whether the given string pangram or not. 
A pangram is a string that contains all the letters of the English alphabet. 
An example of a pangram is "The quick brown fox jumps over the lazy dog"
*/
import java.util.Scanner;

public class Panagrams {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the line to detect panagrams");
		String s = scanner.nextLine();
		scanner.close();
		int flag = 1;
		int[] a = new int[26];

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				a[ch - 'a']++;
			}
		}

		for (int i = 0; i < 26; i++) {
			if (a[i] == 0) {
				flag = 0;
				break;
			}
		}

		System.out.println((flag == 1) ? "Yes" : "No");
	}
}
