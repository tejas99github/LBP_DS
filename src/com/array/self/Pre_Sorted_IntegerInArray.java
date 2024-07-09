package com.array.self;

import java.util.Arrays;
import java.util.Scanner;

/*
LBP184 : pre-sorted integers in array

You are given an array of integers, a of size n, Your task is to find the number of elements whose positions will remain unchanged after sorted in ascending order.

input ----> array size and elements
con ------> no
output ---> unchanged count

a=[1,3,2,4,5]
a=[1,2,3,4,5]

3
*/
public class Pre_Sorted_IntegerInArray {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = obj.nextInt();
		int c = 0;

		int a[] = new int[n];
		int b[] = new int[n];

		System.out.println("Enter elements into array : ");
		for (int i = 0; i < n; i++)
			a[i] = obj.nextInt();

		for (int i = 0; i < n; i++)
			b[i] = a[i];

		Arrays.sort(b);

		for (int i = 0; i < n; i++) {
			if (a[i] == b[i])
				c++;
		}

		System.out.println(c);

		obj.close();
	}

}
