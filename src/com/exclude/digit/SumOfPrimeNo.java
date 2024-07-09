package com.exclude.digit;

import java.util.Scanner;

public class SumOfPrimeNo {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = obj.nextInt();
		int sum = 0;

		while (n != 0) {
			int d = n % 10;
			if (d == 2 || d == 3 || d == 5 || d == 7)
				sum = sum + d;
			n = n / 10;
		}
		System.out.println("Sum of Prime number : " + sum);
		obj.close();
	}

}
