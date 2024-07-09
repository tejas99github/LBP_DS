package com.freq;

import java.util.Scanner;

/*LBP263 : mathematics class

In a mathematics class, number system is being taught to students, before teaching them 10's and 100's place, they will be taught the number positions. 
The positions will be starting from sequence number 1 and the direction will be from left to right.

So if i want to find second position of a digit in the number 90876, it will be 0.
if the kth digit exceeds the number position return -1.
*/
public class Number_Position {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = obj.nextLine();

		System.out.println("Enter the positon : ");
		int i = obj.nextInt();
		obj.close();
		System.out.println((i < s.length()) ? s.charAt(i - 1) : "-1");

	}

}
