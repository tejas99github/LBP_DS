package com.matrix_3;

import java.util.Scanner;

/*lower triangular matrix
Program to accept a matrix and check whether it is lower triangular matrix or not
*/
public class LowerTriMatrix {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter element into matrix to check UTM :");
		int a[][] = new int[3][3];
		int i, j;
		boolean flag = true;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = obj.nextInt();
			}
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (a[i][j] != 0 && j > i)
					flag = false;
			}
		}
		System.out.println((flag) ? "Yes" : "No");
		obj.close();

	}

}
