package com.string;

/*Is the String in Order?
Create a function that takes a string and returns true or false, depending on whether the characters are in order or not.
*/
import java.util.Scanner;

public class StringInOrder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the stirng : ");
		String s1, s2 = "";
		s1 = scanner.next();
		s2 = s1;

		// Sort the characters in s1 manually
		char[] charArray = s1.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] > charArray[j]) {
					char temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
			}
		}
		s1 = new String(charArray);

		// Check if the sorted string s1 is equal to the original string s2
		boolean isEqual = true;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				isEqual = false;
				break;
			}
		}

		System.out.println(isEqual ? "true" : "false");
		scanner.close();
	}
}
