package com.exclude.digit;

import java.util.Scanner;

/*An e-commerce company plans to give their customers a discount for the newyears holiday. 
The discount will be calcualted on the basis of the bill amount of the order placed. 
The discount amount is the sum of all the odd digits in the customers total bill amount. 
if no odd digits is present in the bill amount, then discount will be zero.

input ---------> the input consists of an integer bill amount, representing the customers total bill amount.

output -------> print an integer representing the dicount for the given total bill amount.
constraint ---> n>0*/
public class DiscOnOddDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the bill amount > ");
		int bill_amt = scanner.nextInt();
		int discount = 0;
		while (bill_amt != 0) {
			int d = bill_amt % 10;
			if (d % 2 != 0) {
				discount = discount + d;
			}
			bill_amt = bill_amt / 10;
		}
		System.out.println("Discount on Total Bill is >>  " + discount);
		scanner.close();
	}

}
