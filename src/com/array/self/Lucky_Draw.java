package com.array.self;

import java.util.Arrays;
import java.util.Scanner;

/*LBP190 : lucky draw

A person went to an exhibition. A lucky draw is going on, where one should buy a ticket. And if they ticket number appear on the screen, that ticket will be considered as jackpot winner.
he knows the secret of picking up the ticket number, which will be considered for the jackpot.

1. sort the ticket number in the increasing order.
2. Now, the difference between the adjacent digits should not be more than 2.

If his ticket follows the above condition, then there are more chances to win the jackpot.
Given a ticket number, find whether the ticket is eligible to be part of jackpot or not. Print "Yes/No" based on the result.

Ex:
171---> 117 ---> No
123 --> 123 ---> Yes
*/
public class Lucky_Draw {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n = obj.nextInt();
		int a[] = new int[3];

		int flag = 1;

		int i = 0;

		while (n != 0) {
			a[i++] = n % 10;
			n = n / 10;
		}

		int len = i;

		Arrays.sort(a);

		for (i = 0; i < len - 1; i++) {
			if (a[i + 1] - a[i] > 2) {
				flag = 0;
				break;
			}
		}
		System.out.println((flag == 1) ? "Yes" : "No");
		obj.close();
	}

}
