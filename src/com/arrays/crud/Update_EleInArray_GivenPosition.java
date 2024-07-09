package com.arrays.crud;

import java.util.Scanner;

public class Update_EleInArray_GivenPosition {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = obj.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the element into array : ");
		for (int i = 0; i < size; i++) {
			a[i] = obj.nextInt();
		}
		System.out.println("Enter the index Postion to be repalce with new element");
		int loc = obj.nextInt();

		System.out.println("Enter the element which replce at postion ");
		int newele = obj.nextInt();

		a[loc] = newele;

		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
		obj.close();

	}

}
