package com.freq;

import java.util.Scanner;

/*LBP260 : factorial game

Mikes likes to play with numbers. 
His friends are also good with numbers and often plays mathematical games.
they made a small game where they will spell the last digit of a factorial of a number other than 0.

Let say the given number is 5, so 5! will be 120, Here 0 is the last digit. 
But we dn't want 0, we want a number other than 0. Then last digit is 2.

0!=1 -----> 1
1!=1 -----> 1
2!=2 -----> 2
3!=6 -----> 6
4!=24 ----> 4
5!=120 ---> 2
*/
public class LastDigitof_Fact_OtherThanZero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n = scan.nextInt();
		scan.close();
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		if (fact % 10 == 0) {
			System.out.println((fact / 10) % 10);
		} else {
			System.out.println(fact % 10);
		}

	}

}
