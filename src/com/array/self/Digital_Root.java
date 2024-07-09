package com.array.self;

import java.util.Scanner;

/*LBP188 : digital root

Write a program to find the digital root of a given number. 

Note : Digital root is the recursive sum of digits in the given number 
(until single digit is arrived)

123=1+2+3=6
159=1+5+9=15=1+5=6
*/
public class Digital_Root {

	static int sum(int n) {
		int s = 0;
		while (n != 0) {
			s = s + (n % 10);
			n = n / 10;
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = obj.nextInt();
		while (true) {
			if (n >= 0 && n <= 9) {
				System.out.println(n);
				break;
			} else
				n = sum(n);
		}
		obj.close();
	}

}
