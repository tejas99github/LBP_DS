package com.array.basic;

import java.util.Scanner;

/*LBP138: number of even and odd elements
Implement a program to find number of even and odd elements in the given array
*/
public class Count_EvenOdd_Element {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array : ");

		int size = obj.nextInt();

		int a[] = new int[size];

		System.out.println("Add element into array a : ");
		for (int i = 0; i < size; i++) {
			a[i] = obj.nextInt();
		}
		obj.close();
		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i < size; i++) {
			if (a[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		System.out.println("EvenCount : " + evenCount);
		System.out.println("OddCoutn : " + oddCount);

	}

}
