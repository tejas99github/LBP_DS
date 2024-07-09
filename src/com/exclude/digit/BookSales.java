package com.exclude.digit;

import java.util.Scanner;

public class BookSales {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();

		if (x >= 30 && x <= 100) {

			if (x >= 30 && x <= 50) {
				System.out.println("D");
			} else if (x >= 51 && x <= 60) {
				System.out.println("C");
			} else if (x >= 61 && x <= 80) {
				System.out.println("B");
			} else {
				System.out.println("A");
			}

		} else {
			System.out.println("Invalid");
		}

		scan.close();
	}

}
