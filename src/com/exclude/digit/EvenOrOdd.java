package com.exclude.digit;

import java.util.Scanner;

//Program to check whether the given number is even or odd number

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number : ");

		int n = scanner.nextInt();

		if (n >= 0) {

			if (n % 2 == 0) {

				System.out.println("Even");

			} else {

				System.out.println("Odd");
			}

		} else {

			System.out.println("Envalid");
		}

		scanner.close();

	}

}
