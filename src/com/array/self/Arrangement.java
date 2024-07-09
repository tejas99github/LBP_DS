package com.array.self;

import java.util.Arrays;
import java.util.Scanner;

/*LBP179 : arrangement
given an array of size n, write a function to rearrange the numbers of the array in such that even and odd numbers are arranged alternatively in increasing order.

n=5
a=4 1 3 5 2 ---> 1 2 3 4 5 --> 2,4 and 1,3,5 ---> 2,1,4,3,x,5

logic:

read array
sort the array
copy even elements into one array
copy odd elements into another array
*/
public class Arrangement {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = obj.nextInt();

		int a[] = new int[n];

		int b[] = new int[n / 2];

		int c[] = new int[n / 2];

		System.out.println("Enter elemetn into array ");
		for (int i = 0; i < n; i++)
			a[i] = obj.nextInt();

		Arrays.sort(a);

		int j = 0;
		
		int k = 0;
		
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0)
				b[j++] = a[i];
			else
				c[k++] = a[i];
		}
		
		int i = 0;
		while (i < n / 2) {
			System.out.print(b[i] + " " + c[i] + " ");
			i++;
		}
		obj.close();
	}

}
