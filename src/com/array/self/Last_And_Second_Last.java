package com.array.self;

import java.util.Scanner;

/*LBP187 : last and second-last
Given a string, 
create a new string made up of its last two letters, reversed and seperated by comma.
*/
public class Last_And_Second_Last {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = obj.nextLine();
		System.out.println(s.charAt(s.length() - 1) + "," + s.charAt(s.length() - 2));
		obj.close();
	}

}
