package com.string;

import java.util.Scanner;

public class Palindrome_String {

	public static boolean isPalindrome(String s) { // MADAM

		int low = 0;
		int high = s.length() - 1; // 4

		while (low <= high) { // 0<=4, 1<=3, 2<=2 , 3<=1

			if (s.charAt(low) != s.charAt(high)) { // M!=M A!=A, D!=D
				return false;
			}

			low++; // 1,2 3
			high--; // 3,2,1
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String to check palindrome or not >> ");
		String str = scanner.nextLine();
		System.out.println(isPalindrome(str) == true ? "It Is Palindrome" : "Not Palindrome");

		// Predefined Method Use

//		   	String s1 = scanner.nextLine();
//	        StringBuffer sb = new StringBuffer(s1);
//	        sb.reverse();
//	        String s2 = sb.toString();
//	        System.out.println((s1.equals(s2))?"valid":"invalid");
//	        System.out.println((s1.equalsIgnoreCase(s2))?"valid":"invalid");

		scanner.close();
	}

}
