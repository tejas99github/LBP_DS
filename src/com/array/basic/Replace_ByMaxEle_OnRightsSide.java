package com.array.basic;

import java.util.Scanner;

/*replace every element with the greatest element on its right side
Implement a program to read an array and replace every element with the greatest element on its right side.
*/
public class Replace_ByMaxEle_OnRightsSide {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = obj.nextInt();

		int a[] = new int[size];
		int max;

		System.out.println("Add element into array : ");
		for (int i = 0; i < size; i++) {
			a[i] = obj.nextInt();
		}

		for (int i = 0; i < size; i++) {
			max = a[i];
			for (int j = i + 1; j < size; j++) {
				if (max < a[j]) {
					max = a[j];
				}
				a[i] = max;
			}
		}

		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
		obj.close();
	}

}
