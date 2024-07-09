package com.string;

import java.util.Scanner;

/*Create a function/method that takes a string and return the word count. The string will be a sentence.*/
public class WordCounter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input sentence
		System.out.print("Enter a sentence: ");
		String sentence = scanner.nextLine();

		// Call the countWords method and display the result
		int wordCount = countWords(sentence);
		System.out.println("Word count: " + wordCount);

		// predefined method

//        String[] s = scanner.nextLine().split(" ");
//        System.out.println(s.length);

		scanner.close();
	}

	public static int countWords(String sentence) {
		int wordCount = 0;
		// We initialize the boolean variable inWord to false, which will indicate
		// whether we are currently inside a word or not.
		boolean inWord = false;
		System.out.println(sentence.length());
		// Iterate through each character in the sentence
		for (int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);

			// Check if the current character is a letter
			if (Character.isLetter(c)) {
				// If not already in a word, we've found the start of a new word
				if (!inWord) {
					wordCount++;
					inWord = true;
				}
			} else {
				// If the character is not a letter, it's a separator (space, punctuation, etc.)
				// Set inWord to false to indicate we're not in a word anymore
				inWord = false;
			}

		}

		return wordCount;
	}
}
