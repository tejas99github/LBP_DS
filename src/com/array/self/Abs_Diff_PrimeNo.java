package com.array.self;

import java.util.Arrays;
import java.util.Scanner;

/*LBP182 : absolute difference between prime numbers

You are given an array of integers, N of size array length. 
Find the absolute difference (i.e. diff>=0) between the largest and smallest prime numbers.

Note:
	1. if there are 1 or fewer prime numbers in array return 0.
	2. the array may contain +ve and -ve numbers, ignore -ve numbers.
	3. 1 and 0 are not prime.
*/
public class Abs_Diff_PrimeNo {

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
		System.out.println("Enter size of array : ");
		int n = obj.nextInt();
		int a[] = new int[n];

		System.out.println("Enter ele into array : ");
		for (int i = 0; i < n; i++)
			a[i] = obj.nextInt();

		Arrays.sort(a);

		int min = 999;
		int max = -1;

		for (int i = 0; i < n; i++) {
			if (isprime(a[i])) {
				if (min > a[i])
					min = a[i];
				if (max < a[i])
					max = a[i];
			}
		}
		if (max != -1 && min != 999)
			System.out.println(max - min);
		else
			System.out.println(0);

		obj.close();
	}

}
