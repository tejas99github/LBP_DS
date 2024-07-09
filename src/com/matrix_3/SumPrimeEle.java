package com.matrix_3;

import java.util.Scanner;

/*Sum of prime elements 
Implement a program to find sum of prime elements in the given matrix.
*/
public class SumPrimeEle {

	static boolean isprime(int n) {
		int i, f = 0;
		for (i = 1; i <= n; i++) {
			if (n % i == 0)
				f++;
		}
		return f == 2;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter elements in matrix");
		int a[][] = new int[3][3];
		int i, j, s = 0;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = obj.nextInt();
			}
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (isprime(a[i][j]))
					s = s + a[i][j];
			}
		}
		System.out.println(s);
		obj.close();
	}

}
