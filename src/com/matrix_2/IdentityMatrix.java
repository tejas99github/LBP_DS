package com.matrix_2;

import java.util.Scanner;

/*identity matrix
Implement a program to check whether the given matrix is identity matrix or not
*/
public class IdentityMatrix {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of row :");
		int row = obj.nextInt();
		System.out.println("Enter the size of column :");
		int column = obj.nextInt();

		int a[][] = new int[row][column];

		System.out.println("Give the Element for 3*3 Matrix ");

		int i, j;
		boolean flag = true;

		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				a[i][j] = obj.nextInt();
			}
		}

		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				if (i == j && a[i][j] != 1) {
					flag = false;
					break;
				}
				if (i != j && a[i][j] != 0) {
					flag = false;
					break;
				}
			}
		}
		System.out.println((flag) ? "Yes" : "No");
		obj.close();
	}

}

/*
 * Identity Matrix 
 * 1 0 0 
 * 0 1 0 
 * 0 0 1
 */
