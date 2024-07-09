package com.array.self;

import java.util.Scanner;

/*LBP166 : Sales Report
a company has a sales record of N products for M days. 
The company wishes to know the maximum revenue received from a given product of the 
N products each day. Write an algorithm to find the higest revenue received each day.
*/
public class SalesReport {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter no of products");
		int n = obj.nextInt();
		System.out.println("Enter no of days");
		int m = obj.nextInt();
		int a[][] = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = obj.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			int max = a[i][0];
			for (int j = 1; j < m; j++) {
				if (max < a[i][j])
					max = a[i][j];
			}
			System.out.print(max + " ");
		}
		obj.close();
	}

}

//Enter no of products
//3

//Enter no of days
//4

//100 150 120 180
//200 220 250 230 
//300 280 320 310

//180 250 320 