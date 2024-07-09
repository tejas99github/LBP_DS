package com.digits;

import java.util.Scanner;

/*Find The Sequence Sum

Given three integers i,j&k, a sequence sum to be the value of 
i+(i+1)+(i+2)..+j+(j-1)+(j-2)+..+k

1st way: i+(i+1)+(i+2)..+j and (j-1)+(j-2)+..+k ===> we have taken
2nd way: i+(i+1)+(i+2).. and j+(j-1)+(j-2)+..+k


(increment from i until it equals to j, then decrement from j until equals k). Given values i,j,k. 
caluclate the sequence sum as described.

int getSequenceSum(int,int,int);

input -------> Three int values
constraints--> no
output ------> sum basd on given constraints
*/
public class SequenceSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no from where start incrementing>>");
		int i = scanner.nextInt();
		System.out.println("Enter the no from where stop incrementing & Start decrementing>>");
		int j = scanner.nextInt();
		System.out.println("Enter the no from where stop decrementing>>");
		int k = scanner.nextInt();

		int sum = 0;

		while (i <= j) { // 5<=9, 6<=9, 7<=9,8<=9,9<=9
			sum = sum + (i++); // 0+5+6+7+8+9 = 35
		}
		while (j != k) { //9!=6, 8!=6, 7!=6, 6!=6
			sum = sum + (--j); // 35+8+7+6 = 56
		}
		System.out.println("Sum of Sequence >> " + sum);
		scanner.close();
	}

}
//input : i=5, j=9, k=6 output :56  