package com.matrix_3;

import java.util.Scanner;

/*Sum of elements whose sum of row index and col index is odd
Implement a program to find sum of row index and col index is odd in the given matrix.
*/
public class Sum_RIandCI_Odd {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a[][] = new int[3][3];
		int i, j, s = 0;

		System.out.println("Enter element in matrix");

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = obj.nextInt();
			}
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if ((i + j) % 2 != 0)
					s = s + a[i][j];
			}
		}
		System.out.println(s);
		obj.close();

	}

}
