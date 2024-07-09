package com.array.basic;

import java.util.Scanner;

/*number of duplicate elements in array
Implement a program to find the number of duplicate elements present in the given array.
*/
public class Count_Ducplicate_Ele {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = obj.nextInt();
		int count = 0;

		int a[] = new int[size];

		System.out.println("Enter element in to array : ");

		for (int i = 0; i < size; i++) {
			a[i] = obj.nextInt();
		}

		int b[] = new int[999];

		for (int i = 0; i < size; i++) {
			b[a[i]]++;
		}

		for (int i = 0; i < 999; i++) {
			if (b[i] >= 2) {
				count++;
			}
		}
		System.out.println(count);
		obj.close();
	}

}

//1 1 2 2 3

//a[0]=1
//a[1]=1
//a[2]=2
//a[3]=2
//a[4]=3

//b[a[0]]++ ===> b[1]++ ===> b[1]=1
//b[a[1]]++ ===> b[1]++ ===> b[1]=2
//b[a[2]]++ ===> b[2]++ ===> b[2]=1
//b[a[3]]++ ===> b[2]++ ===> b[2]=2
//b[a[4]]++ ===> b[3]++ ===> b[3]=1

//b[1]=2
//b[2]=2
//b[3]=1
