package com.string;

import java.util.Scanner;

//Program to count number of special characters and white spaces in a given string.
//65-90=> A To Z, 97-122=> a To z, 48-57=> 0 To 9, 32=> (' ') => white space 

public class SplCharSpace {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scanner.nextLine();
		int counter = 0;

		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)
					|| (str.charAt(i) >= 48 && str.charAt(i) <= 57)) {
				continue;
			} else {
				counter++;
			}
		}
		System.out.println(counter);
		scanner.close();
	}

}
