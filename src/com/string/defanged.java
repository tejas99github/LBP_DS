package com.string;

import java.util.Scanner;

/*Given a valid IP address, return a defanged version of that IP address. 
A defanged IP address replaces every period '.' with "[.]"*/

public class defanged {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number : ");
	//	System.out.println(obj.nextLine().replace(".","[.]"));
		String s = obj.nextLine();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '.') {
				System.out.print("[.]");
			} else {
				System.out.print(s.charAt(i));
			}
		}
		obj.close();
	}

}
