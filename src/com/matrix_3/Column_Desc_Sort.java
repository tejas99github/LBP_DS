package com.matrix_3;

import java.util.Arrays;
import java.util.Scanner;

/*sort all the elements in a column in desc order
Implement a program to sort the all the column values in desc order
*/
public class Column_Desc_Sort {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the elements in matrix");

		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int i, j;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = obj.nextInt();
			}
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				b[i][j] = a[j][i];
			}
		}
		for (i = 0; i < 3; i++) {
			Arrays.sort(b[i]);
		}
		for (i = 3 - 1; i >= 0; i--) {
			for (j = 0; j < 3; j++) {
				System.out.print(b[j][i] + " ");
			}
			System.out.println();
		}
		obj.close();
	}

}
