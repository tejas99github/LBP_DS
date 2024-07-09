package com.array.basic;

import java.util.Scanner;

/*number of occurrences of an element
Implement a program to find the number of occurrences of the given element.
*/
public class Count_Occuracne_ofElement {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = obj.nextInt();

		int a[] = new int[size];

		System.out.println("Add element into array : ");
		for (int i = 0; i < size; i++) {
			a[i] = obj.nextInt();
		}

		System.out.println("Element as a key to seach : ");
		int key = obj.nextInt();

		int count = 0;
		for (int i = 0; i < size; i++) {
			if (key == a[i]) {
				count++;
			}
		}

		System.out.println("Key Occurs for " + count + " times");
		obj.close();
	}

}
