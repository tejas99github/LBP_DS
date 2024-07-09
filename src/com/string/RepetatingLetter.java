package com.string;

import java.util.Scanner;

/*LBP66: Repeating Letters
Create a method that takes a string and returns a string in which each character is repeated once.*/
public class RepetatingLetter {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = obj.next();
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + "" + str.charAt(i));
		}
		obj.close();
	}

}
