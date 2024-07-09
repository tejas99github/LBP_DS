package com.string;

import java.util.Scanner;
import java.util.StringTokenizer;

/*Write a function that finds the longest word in a sentence. 
If two or more words are found, return the first longest word. 
Characters such as apostophe, comma, period (and the like) count as part of the word 
(e.g. O'Connor is 8 characters long).
*/
public class LongestWord {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the line : ");
		String s = obj.nextLine();
		StringTokenizer st = new StringTokenizer(s);
		int m = 0;
		String res = "";
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			if (token.length() > m) {
				m = token.length();
				res = token;
			}
		}
		System.out.println(res);
		obj.close();
	}

}
