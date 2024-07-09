package com.array.self;

import java.util.Scanner;

/*LBP170

Matrix to Array

Implement a program to convert the given matrix into array

input -----> matrix of size mxn and elements
con -------> one D array is required
output ----> one-D array should be printed on screen

*/
public class Matrix_To_Array {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		int n = obj.nextInt();
		System.out.println("Enter no of colmn : ");
		int m = obj.nextInt();
		int a[][] = new int[n][m];

		System.out.println("Fill the matrix int n*m martix");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = obj.nextInt();
			}
		}

		System.out.println("Print one dimentsion array ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
		obj.close();
	}

}
