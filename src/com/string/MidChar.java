package com.string;

import java.util.Scanner;

/*Returns the middle character of a string

create a function that takes a string and returns, the middle character(s). 
if the word's length is odd return the midlle character. 
if the word's length is even, return the middle two characters*/
public class MidChar {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the line");
		String s = obj.nextLine();
		obj.close();
		int n = s.length();
		if (n % 2 == 0)
			System.out.println(s.charAt(n / 2 - 1) + "" + s.charAt(n / 2));
		else
			System.out.println(s.charAt(n / 2));

	}

}
