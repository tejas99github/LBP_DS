package com.freq;

import java.util.Scanner;

/*LBP257 : FunGames

The games development company "FunGames" has developed a ballon shooter games. 
The ballons are arranged in a linear sequence and each ballon has a number associated with it.
The numbers on the ballons are fibonacci series. 
In the game the player shoots 'k' ballons. 
The player's score is the sum of numbers on k ballons.

Write an algorithm to generate the player's score.
*/
public class Sum_Of_Fibb_Seq_Till_Nth {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter shoot ballon no : ");
		int k = obj.nextInt();
		obj.close();
		int i, sum = 0, a1 = -1, a2 = 1, a3;
		for (i = 1; i <= k; i++) {
			a3 = a1 + a2;
			sum = sum + a3;
			a1 = a2;
			a2 = a3;
		}
		System.out.println(sum);

	}

}
