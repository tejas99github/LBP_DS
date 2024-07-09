package com.freq;

import java.util.Scanner;

/*LBP280 : Validate ATM PIN

Implement a program that will test if a string is a valid PIN or not via a regular expression.

A valid PIN has:
Exactly 4 characters.
Only numeric characters (0-9).
No whitespace.

*/
public class Pin_Validation {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter stirng : ");
		String s = obj.nextLine();
		obj.close();
		System.out.println(s.matches("[0-9]{4}"));

	}

}
