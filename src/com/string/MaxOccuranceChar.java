package com.string;

import java.util.Scanner;

public class MaxOccuranceChar {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = obj.nextLine();

		// Array to store character frequencies
		int a[] = new int[256];

		// Index of the character with maximum occurrence
		int max = 0;

		int i;

		// Count frequencies of each character in the input string
		for (i = 0; i < s.length(); i++) {
			a[(int) s.charAt(i)]++;

		}

		// Find the index of the character with maximum occurrence
		for (i = 0; i < 256; i++) {
			if (a[i] > a[max])
				max = i;

		}

		// Print the character with maximum occurrence

		System.out.println((char) max);

		obj.close();
	}

}

/*
 * User Input:
 * 
 * User inputs the string "hello". Initialization:
 * 
 * An array a of size 256 is initialized to store character frequencies. max is
 * initialized to 0, which represents the index of the character with the
 * maximum occurrence. Character Frequency Counting:
 * 
 * Iterating through each character of the input string "hello":
 * 
 * // For 'h', a[104] (ASCII value of 'h') is incremented by 1.
 * 
 * // For 'e', a[101](ASCII value of 'e') is incremented by 1.
 * 
 * // For 'l', a[108] (ASCII value of 'l') is incremented by 2 (twice).
 * 
 * // For 'o', a[111] (ASCII value of 'o') is incremented by 1.
 * 
 * At this point, a array holds the frequency of each character:
 * 
 * // a[104] = 1 (for 'h')/ a[101] = 1 (for 'e') / a[108] = 2 (for 'l') / a[111]
 * = 1(for 'o')
 * 
 * 
 * Finding the Character with Maximum Occurrence:
 * 
 * Looping through indices 0 to 255: At index 104: a[104] is 1. At index
 * 101:a[101] is 1. At index 108: a[108] is 2. At index 111: a[111] is 1. The
 * character 'l' has the maximum occurrence with a frequency of 2, so max is
 * updated to 108. Printing the Character with Maximum Occurrence:
 * 
 * The character corresponding to max (108) is 'l', so it prints 'l' as the
 * output.
 */
