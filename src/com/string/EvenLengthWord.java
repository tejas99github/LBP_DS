package com.string;

/*Even Length Words
Write a program to print even length words in a string?
*/
import java.util.Scanner;

public class EvenLengthWord {

	// Custom method to split the input string into words
	public static String[] splitString(String input) {
		int wordCount = 0;
		boolean inWord = false;

		// Count the number of words in the input string
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ') {
				if (!inWord) {
					wordCount++;
					inWord = true;
				}
			} else {
				inWord = false;
			}
		}

		// Create an array to store the words
		String[] words = new String[wordCount];
		int wordIndex = 0;
		StringBuilder wordBuilder = new StringBuilder();

		// Extract each word from the input string
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c != ' ') {
				wordBuilder.append(c);
			} else {
				words[wordIndex++] = wordBuilder.toString();
				wordBuilder.setLength(0); // Reset the StringBuilder
			}
		}

		// Add the last word (if any)
		if (wordBuilder.length() > 0) {
			words[wordIndex] = wordBuilder.toString();
		}

		return words;
	}

	// Custom method to check if a word has even length
	public static boolean isEvenLength(String word) {
		int length = 0;
		// Calculate the length of the word without using built-in methods
		for (char c : word.toCharArray()) {
			length++;
		}
		return length % 2 == 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = scanner.nextLine();

		// Custom method to split the input string into words
		String[] words = splitString(input);

		System.out.println("Even length words in the string:");
		// Iterate through each word
		for (String word : words) {
			// Check if the length of the word is even
			if (isEvenLength(word)) {
				// Print the word if its length is even
				System.out.println(word);
			}
		}

		scanner.close();
	}

}
