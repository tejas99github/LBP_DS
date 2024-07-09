package com.array.basic;

import java.util.Scanner;

/*LBP144

Find the Average of the Letters

Create a function that returns the average of an array composed of letters. 
First, find the number of the letter in the alphabet in order to find the average of the array.

A = 1
B = 2
C = 3
D = 4
E = 5
average = total sum of all numbers / number of item in the set
Return the result rounded to two decimal points.

*/
public class Average_of_Letters {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter string : ");
		String s = obj.nextLine();
		int n = s.length();
		int sum = 0;
		int i;
		for (i = 0; i < s.length(); i++) {
			sum = sum + (s.charAt(i) - 96);
		}
		System.out.printf("%.2f", (sum / (float) n));
		obj.close();
	}

}
