package com.digits;

import java.util.Scanner;

/*Decimal to Binary

A network protocol specifies how data is exchanged via transmission media. 
The protocol converts each message into a stream of 1's and 0's. 
Given a decimal number, write an algorithm to convert the number into a binary form.
*/
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the No : ");
		int n = scanner.nextInt();

		// predefined method
//		System.out.println("By Using predefined method : "+Integer.toBinaryString(n));

		int[] a = new int[100];
		int i = 0;
		while (n != 0) { // 5,2,0
			a[i++] = n % 2; // a[0]=>5%2=1, a[1]=>2%2=0, a[2]=>1%2=1,

			n = n / 2; // 5/2=2, 2/2=1, 1/2=0
		}

		for (i = i - 1; i >= 0; i--) { // i=>3-1=2,
			System.out.print(a[i]); // a[2]=1, a[1]=0, a[0]=1
		}

		scanner.close();
	}

}
//check 5 -> 101 7->111
