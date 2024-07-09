package com.string;

import java.util.Scanner;

/*VOWEL REPLACER
Create a function that replaces all the vowels in a string with a specified character,
*/
public class VowelReplacer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Take user input for the string
		System.out.println("Enter a string:");
		String input = scanner.nextLine();

		// Take user input for the replacement character
		System.out.println("Enter the replacement character:");
		char replacement = scanner.next().charAt(0);

		// Call the replaceVowels function and print the result
		String replacedString = replaceVowels(input, replacement);
		System.out.println("String with vowels replaced: " + replacedString);

		scanner.close();
	}

	public static String replaceVowels(String input, char replacement) {
		char[] inputArray = input.toCharArray();
		for (int i = 0; i < inputArray.length; i++) {
			char ch = inputArray[i];
			if (isVowel(ch)) {
				inputArray[i] = replacement;
			}
		}
		return new String(inputArray);
	}

	public static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}
}
