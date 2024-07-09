package com.digits;

import java.util.Scanner;

//A niven  is a number which is divisible by the sum of its digits
//input 126
public class NivenNo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number >>");
		int n = scanner.nextInt();
		int sum = 0;
		int temp;
		temp = n;
		while (n != 0) {
			sum = sum + (n % 10);
			n = n / 10;
		}
		System.out.println((temp % sum == 0) ? "It is Niven No !" : "It is not Niven No !");
		scanner.close();
	}

}
