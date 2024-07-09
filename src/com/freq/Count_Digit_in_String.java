package com.freq;

import java.util.Scanner;

/*LBP258 : The Past Book

To create a profile on a scocial media account "ThePastBook". 
The user needs to enter a string value in the form of user name. 
The username should consist of only characters tagged a-z. 
if  the user enters an incorrect string containing digits the system automcatically identifiers the number of digits in the string and removes them.

Write an alogorithm to help the system identify the count of digits present in the username.
*/
public class Count_Digit_in_String {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter string : ");
		String s = obj.nextLine();
		obj.close();
		int i, c = 0;
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
				c++;
		}
		System.out.println(c);

	}

}
