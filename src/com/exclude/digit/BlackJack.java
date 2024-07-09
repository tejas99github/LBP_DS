package com.exclude.digit;

import java.util.Scanner;

/*Implement the following function
	int BlackJack(int n1,int n2);
the function accepts two +ve integers n1 and n2 as its arguments. 
Implement the function on given two vlaues to return an int value as follows
return whichever value is nearest to 21 without going over. Return if they go both go over.
n1>21 and n2>21 --------> 0
n1>21 ------------------> n2
n2>21 ------------------> n1
n1<21 and n2<21 --------> max in n1 and n2
*/
public class BlackJack {

	static int bj(int n1, int n2) {
		if (n1 > 21 && n2 > 21)
			return 0;
		if (n1 > 21)
			return n2;
		else if (n2 > 21)
			return n1;
		else
			return Math.max(n1, n2);
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the first no");
		int n1 = obj.nextInt();
		System.out.println("Enter the second no");
		int n2 = obj.nextInt();
		System.out.println(bj(n1, n2));
		obj.close();
	}

}
