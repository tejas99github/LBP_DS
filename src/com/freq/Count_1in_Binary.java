package com.freq;

import java.util.Scanner;

/*LBP261

Speed Maths

Jack was in 9th standard. He appeared for a speed maths competivie exam. 
Jack is taking longer time to solve one of the problems. 
Count the number of 1's in the binary representation of an integer. 
Help him to solve the below problem and write a code for the same.

*/
public class Count_1in_Binary {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter no : ");
		int n = obj.nextInt(), c = 0, d;
		obj.close();
		while (n != 0) {
			d = n % 2;
			if (d == 1)
				c = c + 1;
			n = n / 2;
		}
		System.out.println(c);

	}

}
