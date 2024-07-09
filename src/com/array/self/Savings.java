package com.array.self;

import java.util.Scanner;

/*LBP185 : savings
There are 3 friends named Ronaldo,Messi,Rooney who worked at a compnay. Given thier monthly salaries and monthly expendictures, returns the highest saving amoung them.
*/
public class Savings {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("enter monthly salary : ");
		int a1 = obj.nextInt();
		System.out.println("enter monthly expenditure : ");
		int a2 = obj.nextInt();

		System.out.println("enter monthly salary : ");
		int b1 = obj.nextInt();
		System.out.println("enter monthly expenditure : ");
		int b2 = obj.nextInt();

		System.out.println("enter monthly salary : ");
		int c1 = obj.nextInt();
		System.out.println("enter monthly expenditure : ");
		int c2 = obj.nextInt();

		int a = a1 - a2;
		int b = b1 - b2;
		int c = c1 - c2;

		obj.close();
		System.out.println((a > b && a > c) ? a : (b > c) ? b : c);
	}

}
