package com.array.self;

import java.util.Scanner;

/*LBP189 : absolute difference

Write a program to find the absolute difference between the original number and its reserved number.

123-321==>-102---> 102

logic: abs(n-rev(n))
*/
public class Absolute_Difference {

	static int rev(int n) {
		int r = 0;
		while (n != 0) {
			r = r * 10 + (n % 10);
			n = n / 10;
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = obj.nextInt();
		System.out.println(Math.abs(n - rev(n)));
		obj.close();
	}

}
