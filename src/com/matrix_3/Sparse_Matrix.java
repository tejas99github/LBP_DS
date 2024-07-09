package com.matrix_3;

import java.util.Scanner;

/*Implement a program to check whether the given matrix is sparse matrix or not.

Note: a sparse matrix is a matrix with the majority of its elements equal to zero.
*/
public class Sparse_Matrix {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int i, j, counter = 0;
		int a[][] = new int[3][3];
		System.out.println("Enter the elements in martix : ");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = obj.nextInt();
			}
		}

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (a[i][j] == 0) {
					counter++;
				}
			}
		}
		System.out.println((counter >= 5) ? "Yes" : "No");
		obj.close();
	}

}
