package com.array.basic;

import java.util.Scanner;

/*sum of prime numbers in an array
Implement a program to read an array elements and print sum of all prime elements.
*/
public class SumOfPrimNoArray {

	static boolean isprime(int n) {
		int factors = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				factors++;
		}
		return factors == 2;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n = obj.nextInt();
		int a[] = new int[n];

		System.out.println("Enter element in to array : ");
		for (int i = 0; i < n; i++) {
			a[i] = obj.nextInt();
		}

		int sum = 0;

		for (int i = 0; i < n; i++) {
			if (isprime(a[i])) {
				sum = sum + a[i];
			}
		}
		System.out.println(sum);
		obj.close();
	}
}
