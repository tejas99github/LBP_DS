package com.exclude.digit;

import java.util.Scanner;

/*Create a function that sums the total number of digits between two numbers inclusive. 
for example, if the numbers are 19 and 22, then (1+9)+(2+0)+(2+1)+(2+2)=19.
*/
public class SumBet2Digti {

	static int sumofdigits(int n) {
		int s = 0, d;
		while (n != 0) {
			d = n % 10;
			s = s + d;
			n = n / 10;
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the 1st no");
		int n1 = obj.nextInt();
		System.out.println("Enter the 2nd no");
		int n2 = obj.nextInt();
		int s = 0, i;
		for (i = n1; i <= n2; i++) {
			s = s + sumofdigits(i);
		}
		System.out.println(s);
		obj.close();
	}

}
