package com.exclude.digit;

import java.util.Scanner;

/*An e-Commerce company plans to give thier customers a discount for the newyears holiday. 
The discount will be calcualted on the basis of the bill amount of the order place.
The discount amount is the product of the sum of all odd digits and the sum of all even digits of 
the customers total bill amount.
*/
public class Discount {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter bill amount : ");
		int n = obj.nextInt(), se = 0, so = 0, d;
		while (n != 0) {
			d = n % 10;
			if (d % 2 == 0)
				se = se + d;
			else
				so = so + d;
			n = n / 10;
		}
		System.out.println(se * so);
		obj.close();
	}
}
