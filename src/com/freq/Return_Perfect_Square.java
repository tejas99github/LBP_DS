package com.freq;

import java.util.Scanner;

/*LBP267 : party quiz

While sitting in party, Tom came up with an idea of a quiz. 
and the quiz is, Tom will spell out a number, and a person has to tell a number which is next to it. But this number has to be perfect square.

input -----> a number from the user
con -------> no
output ----> the perfect square after N

n=7 ---> 8, 9, 10, 11, 12, ..... ----> 9
*/
public class Return_Perfect_Square {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = obj.nextInt();
		obj.close();

		int i;
		for (i = 1;; i++) {
			if (i * i >= n) {
				System.out.print(i * i);
				break;
			}
		}

	}

}
