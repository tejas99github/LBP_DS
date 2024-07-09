package com.exclude.digit;

import java.util.Scanner;

public class SumOfEvenNo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the digit :");
		int n = scanner.nextInt();

		int sum = 0;
		while (n != 0) {
			int d = n % 10;
			if (d % 2 == 0) {
				sum = sum + d;
			}
			n = n / 10;
		}
		System.out.println("Sum of Even Digit : " + sum);
		scanner.close();
	}

}
