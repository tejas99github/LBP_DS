package com.digits;

import java.util.Scanner;

/*A Special two digit number

A special two digit number is a number such that when the sum of its digits is added to the product of its digits, 
the result should be equal to the original two-digit number.

Implement a program to accept a two digit number and check whether it is a special two digit number or not.

input -----> a two digit number
constraint-> 10<=n<=99
output ----> special two digit number or not
check -- 59 29 79 89 in input
*/
public class SpecialDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check whether is it special digit or not >");
		int n = scanner.nextInt();
		if (n >= 10 && n <= 99) {
			int a = n % 10;
			int b = (n / 10);
			int c = (a + b) + (a * b);
			System.out.println((c == n) ? "It is Special Digit !" : "It is not Special Digit !");
		} else {
			System.out.println("Invalid Input");
		}

		scanner.close();
	}

}
