package com.freq;

import java.util.Scanner;

/*LBP254 : Easy Shopping

The e-commerce company 'Easy Shopping' displays some specific products for its premium customers on its user interface. 
The company shortlisted a list of N products.
The list contains the price of each product. 
The company will select random products for display.
The selection criteria states that only those products whose price is a perfect cube number will be selected for display. 
The selection process is automated and is done by the company's system.
The company wishes to know the total count of the products selected for display.

Write an algorithm to find the count of products that will be displayed.
*/
public class Print_Perfect_Cube {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n = obj.nextInt();
		int i, c;

		int a[] = new int[n];

		System.out.println("Enter element into array : ");
		for (i = 0; i < n; i++)
			a[i] = obj.nextInt();

		obj.close();

		for (i = 0; i < n; i++) {
			c = 0;
			while (c <= a[i]) {
				if (c * c * c == a[i]) {
					System.out.print(a[i] + " ");
					break;
				}
				c++;
			}
		}

	}

}
