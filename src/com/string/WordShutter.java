package com.string;

/*write a function that shutters a word as if someone is struggling to read it. 
The first two letters are repeated twice with an ellipsis ... and 
then the word is pronounced with a question mark?
*/

import java.util.Scanner;

public class WordShutter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input word
		System.out.println("Enter a word:");
		String word = scanner.nextLine();

		// Call the shutterWord function and print the result
		System.out.println(shutterWord(word));

		scanner.close();
	}

	public static String shutterWord(String word) {
		// Extract the first two letters of the word
		char firstLetter = word.charAt(0);
		char secondLetter = word.charAt(1);

		// Build the shuttered word with ellipsis and question mark
		String shutteredWord = "" + firstLetter + secondLetter + "..." + firstLetter + secondLetter + "..." + word
				+ "?";

		return shutteredWord;
	}
}
/*
 * the empty string "" at the beginning of the concatenation is not strictly
 * necessary. It's a common technique used to convert primitive types or
 * characters to strings by implicitly invoking their toString() method.
 */
