package com.array.self;

import java.util.Scanner;

/*LBP175 : Print Prime Numbers
Implement a program to read a number and print prime numbers upto n seperated by commas.
*/
public class PrintPrimeNo {

	static boolean isprime(int n) {
		int f = 0, i;
		for (i = 1; i <= n; i++) {
			if (n % i == 0)
				f++;
		}
		return f == 2;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the No : ");
		int n = obj.nextInt();
		for (int i = 2; i <= n; i++) {
			if (isprime(i))
				System.out.print(i + " ");
		}
		obj.close();
	}

}