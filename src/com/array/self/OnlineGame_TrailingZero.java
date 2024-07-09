package com.array.self;

import java.util.Scanner;

/*LBP167 : Online Game

You are playing an online game. In the game, a numbers is displayed on the screen. 
In order to win the game, you have to count the trailing zeros in the factorial value 
of the given number. W
rite an algorithm to count the trailing zeros in the factorial value of the given number.
*/
public class OnlineGame_TrailingZero {

	static int count(int n) {
		int c = 0;
		while (n != 0) {
			if (n % 10 == 0)
				c++;
			else
				break;
			n = n / 10;
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = obj.nextInt();
		int f = 1, i;
		for (i = 1; i <= n; i++)
			f = f * i;
		System.out.println(count(f));
		obj.close();
	}
}