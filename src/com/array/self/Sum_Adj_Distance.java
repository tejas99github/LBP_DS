package com.array.self;

import java.util.Scanner;

/*Sum of adjacent Distances
Write a program to calculate and return sum of distances between 
the adjacent numbers in an array of +ve integers.
logic:

5
10 11 7 12 14

10-11=-1
11-7=4
7-12=5
12-14=2

1+4+5+2=12

*/
public class Sum_Adj_Distance {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size : ");
		int n = obj.nextInt();
		int i, sum = 0;
		int a[] = new int[n];
		System.out.println("Enter elemetn :  ");
		for (i = 0; i < n; i++)
			a[i] = obj.nextInt();
		for (i = 0; i < n - 1; i++) {
			sum = sum + Math.abs(a[i] - a[i + 1]);
		}
		System.out.println(sum);
		obj.close();
	}
}
