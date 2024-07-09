package com.string;

import java.util.Scanner;

/*Reverse the order of a String
create a method/function that takes a string as its argument and returns the string in reversed order.*/
public class ReverseString {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter String ");
		String s = obj.nextLine();
		
		String reverse = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			reverse = c + reverse;

		}
		System.out.println("Reverse String : " + reverse);

		//checking palindrome 
		if (s.equals(reverse)) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("It is not palindrome");
		}

		obj.close();
	}

}
