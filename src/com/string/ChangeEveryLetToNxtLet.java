package com.string;

import java.util.Scanner;

/*Change Every Letter to the Next Letter
Write a function that changes every letter to the next letter:
"a" becomes "b"
"b" becomes "c"
"d" becomes "e"
and so on ...
*/
public class ChangeEveryLetToNxtLet {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = obj.nextLine();
		for (int i = 0; i < s.length(); i++) {
			System.out.print((char) (s.charAt(i) + 1));
		}
		obj.close();
	}

}
