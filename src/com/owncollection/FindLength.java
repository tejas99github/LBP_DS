package com.owncollection;

import java.util.Scanner;

public class FindLength {

	// Method to convert string to char array
	public static char[] stringToCharArray(String str) {
		char[] charArray = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			charArray[i] = str.charAt(i);
		}
		return charArray;
	}

	// Method to count length of a string
	public static int findLength(String str) {
		int length = 0;
		for (char c : str.toCharArray()) {
			length++;
		}
		return length;
	}

	// Method to count length of a char array
	public static int findLength(char[] arr) {
		int length = 0;
		for (char c : arr) {
			length++;
		}
		return length;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Taking user input for string
		System.out.println("Enter a string:");
		String str = scanner.nextLine();

		// Taking user input for char array
		System.out.println("Enter characters separated by spaces:");
		String charInput = scanner.nextLine();
		char[] charArray = stringToCharArray(charInput);

		// Count length for string
		int strLength = findLength(str);
		System.out.println("Length of string: " + strLength);

		// Count length for char array
		int charArrayLength = findLength(charArray);
		System.out.println("Length of charArray: " + charArrayLength);

		scanner.close();
	}

}
