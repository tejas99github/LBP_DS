package com.string;

import java.util.Scanner;

public class Print1stLetter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String input = scanner.nextLine();
		scanner.close();

		printFirstLetters(input);
	}

	public static void printFirstLetters(String input) {
		// Variable to track the start index of each word
		int startIndex = 0;

		// Iterate through each character of the input string
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			// Check if the current character is a space or end of string
			if (ch == ' ' || i == input.length() - 1) {
				// Extract the word and print its first character
				String word = input.substring(startIndex, i + 1).trim();
				if (!word.isEmpty()) {
					System.out.print(word.charAt(0));
				}

				// Update the start index for the next word
				startIndex = i + 1;
			}
		}
	}
}
