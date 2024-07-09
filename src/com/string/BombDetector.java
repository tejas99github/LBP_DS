package com.string;

import java.util.Scanner;

public class BombDetector {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		// Prompt the user to enter a string
		System.out.println("Enter a string:");
		String inputString = scanner.nextLine();

		String result = findBomb(inputString);
		System.out.println(result);

		scanner.close();
	}

	public static String findBomb(String input) {
		// Convert the input string to lowercase for case insensitivity
		char[] lowercaseInput = new char[input.length()];
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			// Convert uppercase letters to lowercase
			if (c >= 'A' && c <= 'Z') {
				lowercaseInput[i] = (char) (c + 32);
			} else {
				lowercaseInput[i] = c;
			}
		}

		// Iterate through the string to find the word "bomb"
		for (int i = 0; i < lowercaseInput.length ; i++) {
			// Check if the substring starting at index i matches "bomb"
			if (lowercaseInput[i] == 'b' && lowercaseInput[i + 1] == 'o' && lowercaseInput[i + 2] == 'm'
					&& lowercaseInput[i + 3] == 'b') {
				return "DUCK!";
			}
		}

		// If no occurrence of "bomb" is found, return "Relax there's no bomb."
		return "Relax there's no bomb.";
	}
}

/*
 * String s = obj.nextLine().toLowerCase();
 * System.out.println(s.contains("bomb")?"DUCK!":"Relax, there's no bomb.");
 */
