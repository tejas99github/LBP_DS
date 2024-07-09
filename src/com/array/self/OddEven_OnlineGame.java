package com.array.self;

import java.util.Scanner;

/*You are playing an online game. In the game, a list of N numbers is given. 
The player has to arrange the numbers so that all the odd numbers of the list come 
after even numbers. Write an algorithm to arrange 
the given list such that all the odd numbers of the list come after the even numbers.
*/
public class OddEven_OnlineGame {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size : ");
		int n = obj.nextInt();
		int i, a[];
		a = new int[n];
		System.out.println("Enter element : ");
		for (i = 0; i < n; i++)
			a[i] = obj.nextInt();
		for (i = 0; i < n; i++) {
			if (a[i] % 2 == 0)
				System.out.print(a[i] + " ");
		}
		for (i = 0; i < n; i++) {
			if (a[i] % 2 != 0)
				System.out.print(a[i] + " ");
		}
		obj.close();
	}

}
