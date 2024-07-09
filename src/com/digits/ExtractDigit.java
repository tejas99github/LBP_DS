package com.digits;

import java.util.Scanner;

public class ExtractDigit {

	public static void main(String[] args) {
		System.out.println("Enter the number your want to extract ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		while (num != 0) {

			int d = num % 10;

			System.out.print(d + " ");

			num = num / 10;

			scanner.close();
		}
	}

}
