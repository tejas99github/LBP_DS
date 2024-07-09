package com.array.basic;

import java.util.Scanner;

/*sum of palindrome numbers in an array
Implement a program to read an array elements and print sum of all palindrome numbers in array.
*/
public class SumPalindromeNoArray {

	static int reverse(int n) {
		int r = 0, d;
		while (n != 0) {
			d = n % 10;
			r = r * 10 + d;
			n = n / 10;
		}
		return r;
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

			if (a[i] == reverse(a[i])) {
				sum = sum + a[i];
			}

		}
		System.out.println(sum);
		obj.close();
	}

}
