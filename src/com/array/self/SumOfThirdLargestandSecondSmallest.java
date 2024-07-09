package com.array.self;

import java.util.Arrays;
import java.util.Scanner;

/*LBP165 : Third Largest and Second smallest 
Given an integer array and an integer N denoting the array length as input. your task is to return the sum of third largest and second minimum elements of the array.
*/
public class SumOfThirdLargestandSecondSmallest {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("size of array : ");
		int n = obj.nextInt();
		int a[] = new int[n];

		System.out.println("enter ele : ");
		for (int i = 0; i < n; i++)
			a[i] = obj.nextInt();

		Arrays.sort(a);

		System.out.print(a[n - 3] + a[2 - 1]);
		obj.close();
	}

}