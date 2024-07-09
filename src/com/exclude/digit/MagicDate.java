package com.exclude.digit;

import java.util.Scanner;

/*Program to read date, month and year from the user and check whether it is magic date or not.
Here are the rules for magic date.

1) mm*dd is a 1-digit number that matches the last digit in YYYY
2) mm*dd is a 2-digit number that matches the last two digits in YYYY
3) mm*dd is a 3-digit number that matches the last three digits in YYYY
1-5-2005 ---> Yes
2-5-2005 ---> No
2-5-2010 ---> Yes
*/
public class MagicDate {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		// Built in method

//		System.out.println("Enter date : ");
//		String[] s = obj.nextLine().split("-");// d,m,y
//		System.out.println(s[2].endsWith(Integer.toString(Integer.parseInt(s[0]) * Integer.parseInt(s[1]))));

		System.out.println("Enter date : ");
		int d = obj.nextInt();
		System.out.println("Enter month : ");
		int m = obj.nextInt();
		System.out.println("Year date : ");
		int y = obj.nextInt();

		if (d * m == y % 10 || d * m == y % 100 || d * m == y % 1000) {
			System.out.println("It is magic date");
		} else {
			System.out.println("It is not magic date");
		}

		obj.close();

	}

}
