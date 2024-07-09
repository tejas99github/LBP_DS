package com.array.self;

import java.util.Arrays;
import java.util.Scanner;

/*LBP155

Kth SHORTEST PROCESSING QUEUE

A company wishes to modify the technique by which tasks in the processing queue are executed. There are N processes with unique ID's from 0 to N-1. Each of these tasks has its own execution time. The company wishes to implement a new algorithm for processing tasks. for this purpose they have identified a value K by the new algorithm, the processor will first process the task that has the Kth shortest execution time.

Write an algorithm to find the Kth shortest execution time.


logic:

sort the array and then print a[k-1]
*/
public class Kth_Shortest_Processing_Queue {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Ente size  ");
		int n = obj.nextInt();

		int a[] = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = obj.nextInt();
		System.out.println("Ente Kth no ");
		int k = obj.nextInt();
		obj.close();

		Arrays.sort(a);

		System.out.print(a[k - 1]);

	}
}
