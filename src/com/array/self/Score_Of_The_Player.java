package com.array.self;

import java.util.Scanner;

/*LBP199 : score of the player

a game developing company has developed a math game for kids called "Brain Fun". The game is for smartphone users and the player is given list of N positive numbers and a random number K. the player need to divide all the numbers in the list with random number k and then need to add all the quotients received in each division. the sum of all the quotients is the score of the player.

Write an algorithm to generate the score of the player.

input -----> array size, elements and random number k
con -------> no
output ----> an int value
*/
public class Score_Of_The_Player {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = obj.nextInt();

		int a[] = new int[n];

		System.out.println("Enter elements into array : ");
		for (int i = 0; i < n; i++)
			a[i] = obj.nextInt();

		System.out.println("Enter the random number : ");
		int k = obj.nextInt();

		int s = 0;

		for (int i = 0; i < n; i++) {
			s = s + a[i] / k;
		}

		System.out.println(s);
		obj.close();
	}

}
