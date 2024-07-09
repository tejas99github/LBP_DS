package com.array.self;

import java.util.Arrays;
import java.util.Scanner;

/*LBP186 : half ascending and half descending
You are given a list of integers of size N, write an algorithm to sort the first K elements of the list in ascending order and the remaining elements in descending order.
*/
public class Half_Asc_Half_Desc {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n = obj.nextInt();

		int a[] = new int[n];

		System.out.println("Enter element into array : ");
		for (int i = 0; i < n; i++)
			a[i] = obj.nextInt();

		Arrays.sort(a);

		for (int i = 0; i < n / 2; i++)
			System.out.print(a[i] + " ");

		for (int i = n - 1; i >= n / 2; i--)
			System.out.print(a[i] + " ");

		obj.close();
	}

}
