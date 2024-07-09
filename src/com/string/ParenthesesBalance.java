package com.string;

import java.util.Scanner;

/*Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any positions ) so that the resulting parentheses string is valid.
Formally, a parentheses string is valid if and only if:
It is the empty string, or It can be written as AB (A concatenated with B), where A and B are
valid strings, or It can be written as (A), where A is a valid string. 
Given a parentheses
string, return the minimum number of parentheses we must add to make the resulting string valid.*/
public class ParenthesesBalance {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the parentheses string : ");
		String s = obj.nextLine();
		obj.close();
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				counter++;
			}
			if (s.charAt(i) == ')') {
				counter--;
			}
		}
		System.out.println(counter);
	}

}
