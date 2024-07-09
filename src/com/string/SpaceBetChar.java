package com.string;

import java.util.Scanner;

/*LBP70: Space between each character

Create a function that takes a string and returns a string with spaces in between all of the characters.
*/
public class SpaceBetChar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the line");
		String s = scanner.next();
		scanner.close();
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");
		}

	}

}
