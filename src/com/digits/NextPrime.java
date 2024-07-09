package com.digits;

import java.util.Scanner;

/*Given an integer, create a function that returns the next prime. 
If the number is prime, return the number itself.
*/
public class NextPrime {

	static boolean isPrime(int n) {
		int f = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				f++;
			}
		}

		if (f == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = obj.nextInt();
		while (true) {
			if (isPrime(n)) {
				System.out.println(n);
				break;
			}
			n++;
		}
		obj.close();
	}

}
