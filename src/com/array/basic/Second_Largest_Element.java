package com.array.basic;

import java.util.Scanner;

/*second largest element in an array
Implement a program to read array elements and find the second max element in an array.

sorted the array===> a[0], a[1], a[2], ..... a[n-3], a[n-2], a[n-1]

1st max= a[n-1]		1st min=a[1-1]
2nd max= a[n-2]		2nd min=a[2-1]
3rd max= a[n-3]		3rd min=a[3-1]

second largest element = a[n-2]

*/
public class Second_Largest_Element {

	public static void sortArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = obj.nextInt();

		int a[] = new int[size];

		System.out.println("Add element into array : ");
		for (int i = 0; i < size; i++) {
			a[i] = obj.nextInt();
		}

		sortArray(a);

		System.out.println("Sorted Array : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		obj.close();
		System.out.println("\nSecond Largest Element is : ");
		System.out.println(a[size - 2]);

	}

}
