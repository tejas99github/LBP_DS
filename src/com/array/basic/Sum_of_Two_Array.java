package com.array.basic;

import java.util.Scanner;

public class Sum_of_Two_Array {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = obj.nextInt();

		int a[] = new int[size];

		System.out.println("Add element into array a : ");
		for (int i = 0; i < size; i++) {
			a[i] = obj.nextInt();
		}

		int b[] = new int[size];

		System.out.println("Add element into array b : ");
		for (int i = 0; i < size; i++) {
			b[i] = obj.nextInt();
		}

		for (int i = 0; i < size; i++) {
			System.out.print((a[i] + b[i]) + " ");
		}
		obj.close();
	}

}
