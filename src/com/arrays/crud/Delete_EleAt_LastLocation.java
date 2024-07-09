package com.arrays.crud;

import java.util.LinkedList;
import java.util.Scanner;

/*delete an element from last location in an array
Implement a program to delete an element from an array at the last position
*/
public class Delete_EleAt_LastLocation {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Ente initial size for linked list : ");
		int size = obj.nextInt();

		LinkedList<Integer> ll = new LinkedList<Integer>();

		System.out.println("Add element into linked list : ");
		for (int i = 0; i < size; i++) {
			ll.add(obj.nextInt());
		}

		// remove ele at last position
		ll.removeLast();

		// print the list
		for (Object temp : ll.toArray()) {
			System.out.print((Integer) temp + " ");
		}
		obj.close();

	}

}
