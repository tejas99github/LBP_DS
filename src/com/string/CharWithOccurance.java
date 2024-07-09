package com.string;

/*Replace character with it's occurrence
Implement a Program to replace a character with it's occurrence in given string.
String and Character
"abcabab",'a'
output: 1bc2b3b
*/
import java.util.Scanner;

public class CharWithOccurance {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the characters : ");
		String s = scanner.next();
		System.out.println("Enter the char key to search");
		char ch = scanner.next().charAt(0);
		scanner.close();
		int c = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch) {
				System.out.print(++c);
			} else {
				System.out.print(s.charAt(i));
			}
		}
	}
}
