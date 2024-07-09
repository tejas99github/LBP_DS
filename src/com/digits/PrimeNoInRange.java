package com.digits;

import java.util.Scanner;

public class PrimeNoInRange {

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i*i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int start = scan.nextInt();

		System.out.println("Enter the ending number: ");
		int end = scan.nextInt();

		System.out.println("Prime numbers between " + start + " and " + end + ":");
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
		scan.close();
	}
}
