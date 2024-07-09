package com.freq;

import java.util.Scanner;

/*LBP272 : Item id

A company wishes to bucketize their item id's for better search operations. 
The bucket for the item ID is chosen on the basis of the maximum value of 
the digit in the item ID. 
Write an algorithm to find the bucket to which the item ID will be assigned.
12875 ---> 8

*/
public class Max_No {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n = obj.nextInt(), d, m;
		obj.close();
		m = 0;
		while (n != 0) {
			d = n % 10;
			if (d > m)
				m = d;
			n = n / 10;
		}
		System.out.println(m);

	}

}
