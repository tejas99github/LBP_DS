package com.string;

import java.util.Scanner;

public class CountOfConsonant {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the line : ");
		String s = obj.nextLine();
		obj.close();
		int i, c = 0;
		for (i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ')
				continue;
			else
				c++;
		}
		System.out.println(c);

	}

}
