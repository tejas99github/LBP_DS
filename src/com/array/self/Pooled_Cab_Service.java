package com.array.self;

import java.util.Scanner;

/*LBP154 : POOLED CAB SERVICE

A compnay wishes to provide can service for their N employees. The employees have distance ranging from 0 to N-1. The company has calculated the total distance from an employee's residence to the company, considering the path to be followed by the cab is a straight path. The distance of the company from it self is 0. The distance for the employees who live to the left side of the company is represented with a negative sign. The distance for the employees who live to the right side of the company is represented with a positive sign. the cab will be allotted a range of distance. The company wishes to find the distance for the employees who live within the particular distance range.
write a alogrithm to find the distance for the employees who live within the distance range.
*/
public class Pooled_Cab_Service {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size : ");
		int n = obj.nextInt();
		int a[] = new int[n];

		System.out.println("Enter ele : ");
		for (int i = 0; i < n; i++)
			a[i] = obj.nextInt();

		int d1 = obj.nextInt();
		int d2 = obj.nextInt();

		for (int i = 0; i < n; i++) {
			if (Math.abs(a[i]) >= d1 && Math.abs(a[i]) <= d2)
				System.out.print(a[i] + " ");
		}
		obj.close();
	}
}