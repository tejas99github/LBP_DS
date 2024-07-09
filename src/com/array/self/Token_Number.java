package com.array.self;

import java.util.Scanner;

/*LBP198 : token number
Write an algorithm to generate the token number from the application ID by doing this modifications.

R1. If the digit is even add 1 to it.
R2. If the digit is odd sub 1 from it.

input -----> a number from the user
con--------> no
output ----> token number

45789==> 54698
98754==> 
*/
public class Token_Number {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = Integer.parseInt(new StringBuffer(obj.nextLine()).reverse().toString());
		int d;
		while (n != 0) {
			d = n % 10;
			if (d % 2 == 0)
				System.out.print(d + 1);
			else
				System.out.print(d - 1);
			n = n / 10;
		}

	}

}
