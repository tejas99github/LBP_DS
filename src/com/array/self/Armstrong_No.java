package com.array.self;

import java.util.Scanner;

/*LBP192 : digits raised to the third power

Cristina appeared for a corporate Hackathon. She cleated first round of this and would like to take next challenge which is coding round. The problem statement comes to her is
"Write a program to find numbers which are in between integer 2 and integer N and such that the sum of its digits raised to the third power is equal to the number with the input given.

armstrong number
123 = 1^3+2^3+3^3=1+8+27=36
153 = 1^3+5^3+3^3=1+125+27=153
*/
public class Armstrong_No {

	static int sum(int n) {
		int d, s = 0;
		while (n != 0) {
			d = n % 10;
			s = s + d * d * d;
			n = n / 10;
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n = obj.nextInt();
		for (int i = 2; i <= n; i++) {
			if (i == sum(i))
				System.out.print(i + " ");
		}
		obj.close();
	}
}
