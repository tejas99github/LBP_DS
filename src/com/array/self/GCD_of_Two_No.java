package com.array.self;

import java.util.Scanner;

/*LBP176 : GCD of two numbers

Implement a program to read two integers values and return GCD of two numbers.

*/
public class GCD_of_Two_No {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 1st no : ");
		int n1 = obj.nextInt();
		System.out.println("Enter 2nd no : ");
		int n2 = obj.nextInt();
		int n3 = 0;
		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				n3 = i;
			}
		}
		System.out.println(n3);
		obj.close();
	}

}
