package com.freq;

import java.util.Scanner;

/*LBP252 : Employee's Rating Point

In a company, an employee's rating point (ERP) is calculated as the sum of the rating points given by the employee's manager and HR. 
The employee rating grade (ERG) is calculated according to the ERP ranges given below.

ERP	ERG
30-50	D
51-60	C
61-80	B
81-100	A

Write an algorithm to find the ERG character for a given employee's ERP.

*/
public class Rating_Point {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the rating point");
		int n = obj.nextInt();
		obj.close();
		if (n >= 30 && n <= 50)
			System.out.println("D");
		else if (n >= 51 && n <= 60)
			System.out.println("C");
		else if (n >= 61 && n <= 80)
			System.out.println("B");
		else
			System.out.println("A");

	}

}
