package com.string;

import java.util.Scanner;

/*A word has been split into a left part and right part. 
Re-form the word by adding both halves together changing the first to an uppercase letter.
*/
public class WordReform {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input two strings
		System.out.print("Enter the first string: ");
		String s1 = scanner.next();

		System.out.print("Enter the second string: ");
		String s2 = scanner.next();

		// Convert the first character of s1 to uppercase
		char firstChar = s1.charAt(0);
		if (firstChar >= 'a' && firstChar <= 'z') {
			firstChar = (char) (firstChar - 'a' + 'A');
		}

		// Print the re-formed string
		System.out.print(firstChar + s1.substring(1) + s2);

		scanner.close();
	}
}
/*
 * Let's consider an example where firstChar is 'c'. Here's how the conversion
 * would work:
 * 
 * (firstChar - 'a') would be ('c' - 'a'), which is equivalent to (99 - 97),
 * resulting in 2. (firstChar - 'a' + 'A') would be (2 + 65), resulting in 67.
 * Therefore, the resulting value of firstChar would be 'C', the uppercase
 * equivalent of 'c'.
 */