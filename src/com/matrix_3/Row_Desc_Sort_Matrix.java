package com.matrix_3;

import java.util.Arrays;
import java.util.Scanner;

/*sort all the elements in a row in desc order
Implement a program to sort all the row wise elements in desc order*/
public class Row_Desc_Sort_Matrix {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the ele in matrix");
		int a[][] = new int[3][3];
		int i, j;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = obj.nextInt();
			}
		}
		for (i = 0; i < 3; i++) {
			Arrays.sort(a[i]);
		}
		for (i = 0; i < 3; i++) {
			for (j = 3 - 1; j >= 0; j--) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		obj.close();
	}
}