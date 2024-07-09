package com.string;

/*VALID ZIP CODE

zipcodes consists of 5 consecutive digits.
Given a string, write a function to determine whether the input is a valid zip code. 
a valid zipcode is as follows

1. must contain only numbers.
2. it should not contain any spaces.
3. length should be only 5.
*/

import java.util.Scanner;

public class ValidZipCode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Take user input for the zip code
		System.out.println("Enter a zip code:");
		String input = scanner.nextLine();

		// Validate the zip code and print the result
		boolean isValidZipCode = validateZipCode(input);
		if (isValidZipCode) {
			System.out.println("Valid zip code.");
		} else {
			System.out.println("Invalid zip code.");
		}

		scanner.close();
	}

	public static boolean validateZipCode(String input) {
		// Check if the length is exactly 5
		if (input.length() != 5) {
			return false;
		}

		// Check if each character is a digit
		for (char ch : input.toCharArray()) {
			if (!Character.isDigit(ch)) {
				return false;
			}
		}

		// Check if the zip code contains any spaces
		if (input.contains(" ")) {
			return false;
		}

		// If all conditions are met, return true
		return true;
	}
}
