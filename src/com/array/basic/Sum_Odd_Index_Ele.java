package com.array.basic;

import java.util.Scanner;

/*LBP135 : sum of elements available at odd index
Implement a program to find the sum of elements avaiable at odd index locations in an array.
*/
public class Sum_Odd_Index_Ele {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = obj.nextInt();
		int sum = 0;
		int a[] = new int[size];

		System.out.println("Add element into array a : ");
		for (int i = 0; i < size; i++) {
			a[i] = obj.nextInt();
		}

		for (int i = 0; i < size; i++) {
			if (i % 2 != 0) {
				sum = sum + a[i];
			}
		}
		System.out.println(sum);
		obj.close();

	}

}
