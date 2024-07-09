package com.array.self;

import java.util.Scanner;

/*LBP169 : Array to Matrix
Implement a program to convert an array into matrix.
input -----> array size and elements
con -------> element count should be 1,4,9,16,25 and so on
output ----> matrix
*/
public class Array_To_Matrix {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int n = obj.nextInt();

		int a[] = new int[n];

		System.out.println("Enter the ele into array ");
		for (int i = 0; i < n; i++)
			a[i] = obj.nextInt();

		int m = (int) Math.sqrt(n);

		int k = 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[k++] + " ");
			}
			System.out.println();
		}

		obj.close();
	}

}
