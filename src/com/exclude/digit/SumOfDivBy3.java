package com.exclude.digit;

import java.util.Scanner;

public class SumOfDivBy3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scanner.nextInt();
		int sum = 0;
		while (n != 0) {
			int d = n % 10;
			if (d % 3 == 0) {
				sum = sum + d;
			}
			n = n / 10;
		}
		System.out.println("Sum of no divisible by three : " + sum);
		scanner.close();
	}

}
