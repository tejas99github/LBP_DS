package com.string;

import java.util.Scanner;

/*Check if String ending matches second String
Create a function/method that takes two Strings and 
returns true of the first string ends with second string, otherwise return false.*/
public class StringEndsWith {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input first string
		System.out.print("Enter the first string: ");
		String firstString = scanner.nextLine();

		// Input second string
		System.out.print("Enter the second string: ");
		String secondString = scanner.nextLine();

		// Call the endsWith method and display the result
		boolean result = endsWith(firstString, secondString);
		System.out.println("Does the first string end with the second string? " + result);

		// predefined method

//		  String s1 = obj.nextLine();
//        String s2 = obj.nextLine();
//        System.out.println(s1.endsWith(s2));

		scanner.close();
	}

	public static boolean endsWith(String firstString, String secondString) {
		// If the second string is longer than the first one, they can't match
		if (secondString.length() > firstString.length()) {
			return false;
		} 

		// Start from the end of both strings and compare characters
		int firstIndex = firstString.length() - 1;
		int secondIndex = secondString.length() - 1;

		// Iterate backwards through the second string
		while (secondIndex >= 0) {
			// If characters don't match, return false
			if (firstString.charAt(firstIndex) != secondString.charAt(secondIndex)) {
				return false;
			}
			firstIndex--;
			secondIndex--;
		}

		// If the loop completes without returning false, the second string matches the
		// end of the first string
		return true;
	}
}
