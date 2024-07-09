package com.array.basic;

import java.util.Scanner;

/*Retrieve the Last N Elements
Write a function that retrieves the last n elements from an array.
5
1 2 3 4 5
0 1 2 3 4

3 ----> 3 4 5  ----> 5-3=2
2 ----> 4 5    ----> 5-2=3
8 ----> 0 

*/
public class Retrive_LastN_Element {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the size of array : ");
		int size = obj.nextInt();

		int a[] = new int[size];

		System.out.println("Enter element into array : ");
		for (int i = 0; i < size; i++) {
			a[i] = obj.nextInt();
		}

		int Nth = obj.nextInt();
		if (Nth < size) {
			for (int i = size - Nth; i < size; i++)
				System.out.print(a[i] + " ");
		} else
			System.out.println(0);

		obj.close();
	}
}
