package com.matrix_3;

import java.util.Scanner;

/*upper triangular matrix
Program to accept a matrix and check whether it is upper triangular matrix or not
*/
public class UpperTriMatrix {

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
				if (a[i][j] != 0 && j < i)
					flag = false;
			}
		}
		System.out.println((flag) ? "Yes" : "No");
		obj.close();

	}

}

/*
 * logic:
 * 
 * (0,0) (0,1) (0,2) (1,0) (1,1) (1,2) (2,0) (2,1) (2,2)
 * 
 * flag=1;
 * 
 * (1,0),(2,0),(2,1) ===> j<i && a[i][j]!=0
 * 
 * then set flag=0;
 */
