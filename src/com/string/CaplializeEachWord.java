package com.string;

import java.util.Scanner;

public class CaplializeEachWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String input = scanner.nextLine();
		scanner.close();

		String capitalizedSentence = capitalizeWords(input);
		System.out.println("Capitalized sentence:");
		System.out.println(capitalizedSentence);
	}

	public static String capitalizeWords(String sentence) {
		String result = ""; // Initialize an empty string to store the result
		boolean capitalizeNext = true;

		for (int i = 0; i < sentence.length(); i++) {
			char currentChar = sentence.charAt(i);

			// Check if the character is a lowercase letter
			if (currentChar >= 'a' && currentChar <= 'z') {
				// Capitalize the first character of each word
				if (capitalizeNext) {
					result += (char) (currentChar - 'a' + 'A'); // Append the capitalized character
					capitalizeNext = false;
				} else {
					result += currentChar; // Append the character as it is
				}
			} else {
				result += currentChar; // Append the character as it is

				// Set capitalizeNext to true for the next word
				if (currentChar == ' ' || currentChar == '.') {
					capitalizeNext = true;
				}
			}
		}

		return result;
	}
}
