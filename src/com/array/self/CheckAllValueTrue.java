package com.array.self;

import java.util.Scanner;

/*LBP159 : Check if All Values Are True
Write a function that returns true if all parameters are truthy, and false otherwise
*/
public class CheckAllValueTrue {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("size : ");
		int n = obj.nextInt();
		int i;
		int a[] = new int[n];

		System.out.println("Ele : ");
		for (i = 0; i < n; i++)
			a[i] = obj.nextInt();

		boolean flag = true;

		for (i = 0; i < n; i++) {
			if (a[i] == 0) {
				flag = false;
				break;
			}
		}

		System.out.println(flag);
		obj.close();
	}

}
