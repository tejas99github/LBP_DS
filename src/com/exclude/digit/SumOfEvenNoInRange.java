package com.exclude.digit;

import java.util.Scanner;

public class SumOfEvenNoInRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first digit :");
		int n1 = scanner.nextInt();
		System.out.println("Enter the second digit :");
		int n2 = scanner.nextInt();

		int sum = 0;

		for (int i = n1; i <= n2; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Total of Even no >>" + sum);
		scanner.close();
	}

}
