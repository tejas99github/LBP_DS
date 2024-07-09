package com.freq;

import java.util.Scanner;

/*LBP255 : player's score

In a game, organizers has given a number to the player. 
The player has to find out the differnece between the number and the reverse of the number.
The difference between two numbers is the player's score. 
The number given to the player and the player's score can be a negative or positive number.

Write an algorithm to find the player's score.
*/
public class Diff_Bet_No_itsReverse {

	static int rev(int n) {
		int d;
		int r = 0;
		while (n != 0) {
			d = n % 10;
			r = r * 10 + d;
			n = n / 10;
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = obj.nextInt();
		obj.close();
		System.out.println(n - rev(n));
	}

}
