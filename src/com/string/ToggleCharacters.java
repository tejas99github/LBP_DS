package com.string;

import java.util.Scanner;

public class ToggleCharacters {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Alpha_Numeric_Special-Characters ");
		String s = obj.nextLine();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			// Check if the character is a letter
			if (Character.isLetter(c)) {

				// Toggle case for letters
				if (c >= 'A' && c <= 'Z')
					System.out.print((char) (c + 32)); // Convert uppercase to lowercase

				else if (c >= 'a' && c <= 'z')
					System.out.print((char) (c - 32)); // Convert lowercase to uppercase

			} else {

				// Print special characters as they are
				System.out.print(c);
			}
		}
		obj.close();
	}
}
