package com.string;

import java.util.Scanner;

/*Removing Duplicate Characters from a string
Given a string S, the task is to remove all the duplicates in the given string. 
*/
public class RemoveDuplicateChar {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Stirng : ");
		String s = obj.nextLine();
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (res.indexOf(ch) < 0) {
				res = res + ch;
			}
		}
		System.out.println(res);
		obj.close();
	}

}
