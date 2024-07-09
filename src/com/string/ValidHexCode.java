package com.string;

/*Create a function that determines whether a string is a valid hex code.
A hex code must begin with a pound key # and is exactly 6 characters in length. 
Each character must be a digit from 0-9 or an alphabetic character from A-F. 
All alphabetic characters may be uppercase or lowercase.

#XXXXXX ----> 7

*/
import java.util.Scanner;

public class ValidHexCode {

	// Custom method to convert lowercase letters to uppercase
	public static String convertToUppercase(String s) {
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 'a' && chars[i] <= 'z') {
				chars[i] = (char) (chars[i] - 'a' + 'A');
			}
		}
		return new String(chars);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Hexa code to check : ");
		String s = scanner.next();
		int c = 0;

		// Convert lowercase letters to uppercase
		s = convertToUppercase(s);

		if (s.charAt(0) == '#' && s.length() == 7) {
			for (int i = 1; i < s.length(); i++) {
				char ch = s.charAt(i);
				if ((ch >= 'A' && ch <= 'F') || (ch >= '0' && ch <= '9'))
					c++;
			}
		}

		System.out.println(c == 6 ? "true" : "false");
		scanner.close();
	}

}
