package com.matrix_3;

import java.util.Scanner;

/*sort all the elements in a column in asc order
Implement a program to sort all the column values in asc order
logic:
1. read a matrix from the user
2. copy the content of a matrix to b matrix like b[i][j]=a[j][i]
3. apply row wise sorting method
4. print b[j][i] matrix
*/
public class Column_Asc_Sort {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		int a[][] = new int[3][3];
		int b[][] = new int[3][3];

		int i, j, k, t;

		System.out.println("Enter the elements in matrix");

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = obj.nextInt();
			}
		}

		// Transpose of a[i][j]
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				b[i][j] = a[j][i];
			}
		}

		// apply row wise sorting method
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				for (k = j + 1; k < 3; k++) {
					if (b[i][j] > b[i][k]) { // replace comparison operator to < to get descending order
						t = b[i][j];
						b[i][j] = b[i][k];
						b[i][k] = t;
					}
				}
			}
		}

		// print b[j][i] matrix
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(b[j][i] + " ");
			}
			System.out.println();
		}

		obj.close();
	}

}
