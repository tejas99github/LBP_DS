package com.exclude.digit;

import java.util.Scanner;

public class PrintNxtNo {

	public static void main(String[] args) {

		System.out.println("Enter the number :");

		Scanner scanner = new Scanner(System.in);

		int no = scanner.nextInt();

		System.out.println("Next Number :");

		System.out.println(++no);

		scanner.close();
	}

}
