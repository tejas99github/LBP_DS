package com.string;

import java.util.Scanner;  

/*Swap corner words and reverse middle characters
Write a Java program to take an input string and exchange the first and last word and reverse the middle word.
*/

public class SwapCornerReverseMiddle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = scanner.nextLine();

		String fw = "", lw = "";
		int i = 0, j = sentence.length() - 1;

		// Extracting the first word
		while (i < sentence.length() && sentence.charAt(i) != ' ') {
			fw = fw + sentence.charAt(i);
			i++;
		}

		// Extracting the last word
		while (j >= 0 && sentence.charAt(j) != ' ') {
			lw = sentence.charAt(j) + lw;
			j--;
		}

		// Printing the last word
		System.out.print(lw);

		// Printing the middle part in reverse
		for (int k = j; k >= i; k--) {
			System.out.print(sentence.charAt(k));
		}

		// Printing the first word
		System.out.print(fw);

		scanner.close();
	}
}
