package com.owncollection;

public class ReplaceWhiteSpace {
	public static void main(String[] args) {
		String str = "  Hello   World!  ";
		String trimmed = replaceWhiteSpaceManually(str);
		System.out.println("Original string: \"" + str + "\"");
		System.out.println("String with white spaces replaced manually: \"" + trimmed + "\"");
	}

	public static String replaceWhiteSpaceManually(String str) {
		StringBuilder result = new StringBuilder();
		// Iterate through each character in the string
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			// If the character is not a whitespace, append it to the result string
			if (!Character.isWhitespace(ch)) {
				result.append(ch);
			}
		}
		return result.toString();
	}
}
