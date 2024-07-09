package com.digits;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to sum : ");
		int no = scanner.nextInt();
		int sum = 0;
		int d;
		while (no != 0) {
			d = no % 10;
			sum = sum + d;
			no = no / 10;
		}
		System.out.println(sum);
		scanner.close();
	}

}
