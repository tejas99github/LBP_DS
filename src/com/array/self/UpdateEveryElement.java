package com.array.self;

import java.util.Scanner;

/*LBP164 : Update Every Element
Implement a progra to update every array element with multiplication of previous and next numbers in array.
*/
public class UpdateEveryElement {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("size of array : ");
		int n = obj.nextInt();
		int a[] = new int[n];
		System.out.println("ele of array : ");
		for (int i = 0; i < n; i++)
			a[i] = obj.nextInt();

		System.out.print(a[1] + " ");

		for (int i = 1; i < n - 1; i++)
			System.out.print(a[i - 1] * a[i + 1] + " ");

		System.out.print(a[n - 2]);
		obj.close();
	}

}
