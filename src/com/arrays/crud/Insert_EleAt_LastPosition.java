package com.arrays.crud;

import java.util.LinkedList;
import java.util.Scanner;

/*inserting element at last position in an array
Implement a program to insert an element into an array at the last position
*/
public class Insert_EleAt_LastPosition {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Ente initial size for linked list : ");
		int size = obj.nextInt();

		LinkedList<Integer> ll = new LinkedList<Integer>();

		System.out.println("Add element into linked list : ");
		for (int i = 0; i < size; i++) {
			ll.add(obj.nextInt());
		}

		System.out.println("Ente the element to add in list");
		int addAtLast = obj.nextInt();

		// Add element at last position
		ll.addLast(addAtLast);

		// print the list
		for (Object temp : ll.toArray()) {
			System.out.print((Integer) temp + " ");
		}
		obj.close();
	}

}
