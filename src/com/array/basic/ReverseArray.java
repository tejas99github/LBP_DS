package com.array.basic;

import java.util.Scanner;

/*array reverse
Write a program to reverse the elements present in an array
*/
public class ReverseArray {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = obj.nextInt();

		int a[] = new int[size];

		System.out.println("Enter element in to array : ");

		for (int i = 0; i < size; i++) {
			a[i] = obj.nextInt();
		}

		for (int i = size - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		obj.close();
	}

}
