package com.array.self;

import java.util.Scanner;

/*LBP172 : Oddly Even

Given a maximum of 100 digit numbers as input, 
find the difference between the sum of odd and even position digits.

input ------> a number from the user
con --------> no
output -----> an integer

Ex:
45712
01234

4+7+2=13
5+1=6

13-6=7

45712==>21754
        43210
*/
public class Oddly_Even {

	static int rev(int n) {
		int d, r = 0;
		while (n != 0) {
			d = n % 10;
			r = r * 10 + d;
			n = n / 10;
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter no : ");
		int n = obj.nextInt();
		n = rev(n);
		int a[] = new int[100];
		int i = 0;
		while (n != 0) {
			int d = n % 10;
			a[i++] = d;
			n = n / 10;
		}
		int len = i;
		int se = 0, so = 0;
		for (i = 0; i < len; i++) {
			if (i % 2 == 0)
				se = se + a[i];
			else
				so = so + a[i];
		}
		System.out.println(so - se);
		obj.close();
	}
}
