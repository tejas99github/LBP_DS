package com.array.self;

import java.util.Scanner;

/*LBP158: Positives and Negatives

Create a function which validates whether a given array alternates between 
positive and negative numbers.
10 -11 12 -13 14 -----> true
10 -11 12 -13 -14 ----> false
*/
public class PositivesAndNegatives {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Size : ");
		int n = obj.nextInt();
		int a[] = new int[n];
		int i;
		boolean flag = true;
		System.out.println("Ele : ");
		for (i = 0; i < n; i++)
			a[i] = obj.nextInt();

		for (i = 0; i < n - 1; i++) {
			if (a[i] > 0 && a[i + 1] > 0) {
				flag = false;
				break;
			}
			if (a[i] < 0 && a[i + 1] < 0) {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
		obj.close();
	}

}
