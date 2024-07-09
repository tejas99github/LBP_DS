package com.array.basic;

import java.util.Scanner;

/*search for an element in an array
Implement a program to search for an element in an array.
*/
public class Search_Element_In_Array {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = obj.nextInt();

		int a[] = new int[size];

		System.out.println("Enter element in to array : ");

		for (int i = 0; i < size; i++) {
			a[i] = obj.nextInt();
		}

		System.out.println("Enter the element to be search : ");
		int key = obj.nextInt();

		// if element not found return -1
		int index = -1;

		for (int i = 0; i < size; i++) {
			if (key == a[i]) {
				index = i;
				break;
			}
		}

		System.out.println("The element found at " + index + " position.");
		obj.close();
	}

}
