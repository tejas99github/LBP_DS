package com.matrix_3;

import java.util.Scanner;

/*Reverse of each element in matrix
Implement a program to reverse each element in the matrix.
*/
public class ReverseEachElement {

	static int reverse(int n) {
		int r = 0;
		while (n != 0) {
			int d = n % 10;
			r = r * 10 + d;
			n = n / 10;
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a[][] = new int[3][3];
		int i, j;
		System.out.println("Enter the element in matrix");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = obj.nextInt();
			}
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(reverse(a[i][j]) + " ");
			}
			System.out.println();
		}

		obj.close();

	}

}
