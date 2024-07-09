package com.string;

import java.util.Scanner;

/*A company launched a new text editor that allows users to enter english letters, numbers and white spaces only.
If a user attempts to enter any other type of characters, it is counted as miss.
Given a String text, 
write an algorithm to help the developer detect the number of misses by a given user in the given input.*/
public class CharMistake {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a line to check mistakes ");
		String s = obj.nextLine();
		int i, c = 0;
		for (i = 0; i < s.length(); i++) {
			if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
					|| (s.charAt(i) >= '0' && s.charAt(i) <= '9') || (s.charAt(i) == ' '))
				continue;
			else
				c++;
		}
		System.out.println(c);
		obj.close();
	}
}
