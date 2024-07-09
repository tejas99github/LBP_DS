package com.arrays.crud;

import java.util.Scanner;

/*update an element in an array
Implement a program to update an element in the given array
*/
public class Update_Ele_Array {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = obj.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the element into array : ");
		for (int i = 0; i < size; i++) {
			a[i] = obj.nextInt();
		}
		System.out.println("Enter the element to be repalce with new element");
		int oe = obj.nextInt();

		System.out.println("Enter the element which replce the old element ");
		int ne = obj.nextInt();

		// replace the old with new element
		for (int i = 0; i < size; i++) {
			if (a[i] == oe) {
				a[i] = ne;
			}
		}

		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
		obj.close();
	}

}
