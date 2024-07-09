package com.matrix_3;

import java.util.Scanner;

/*Scalar matrix multiplication
Implement a program to read a matrix and multiplier and return scalar matrix multiplication.
*/
public class ScalarMatrix {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a[][] = new int[3][3];
		int i, j;

		System.out.println("Enter element into matrix  :");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = obj.nextInt();
			}
		}

		System.out.println("Enter the multiplier : ");
		int n = obj.nextInt();

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print((a[i][j] * n) + " ");
			}
			System.out.println();
		}

		obj.close();
	}

}
