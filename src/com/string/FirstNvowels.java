package com.string;

import java.util.Scanner;

//Write a function that returns the first n vowels of a string.
/*input ------> a string from the user and an integer value
cons -------> Return "invalid" if the n exceeds the number of vowels in a string.
output -----> return first n vowels in the string
*/
public class FirstNvowels {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Stirng : ");
		String s = obj.nextLine();
		StringBuffer sb = new StringBuffer();
		int n = obj.nextInt();
		obj.close();
		int i;
		for (i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				sb.append(ch);
		}
		if (n < sb.length()) {
			for (i = 0; i < n; i++)
				System.out.print(sb.charAt(i));
		} else
			System.out.println("invalid");
	}

}
