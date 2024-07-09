package com.matrix_3;

import java.util.Scanner;

/*Square of Each Element of Matrix
Implement a program to find square of each element present in a matrix.
*/
public class SquOfEachElem {

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
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print((a[i][j] * a[i][j]) + " ");
			}
			System.out.println();
		}
		obj.close();
	}

}
