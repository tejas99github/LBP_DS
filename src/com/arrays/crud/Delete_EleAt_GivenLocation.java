package com.arrays.crud;

import java.util.LinkedList;
import java.util.Scanner;

/*delete an element from an array at the given location
Implement a program to delete an element from an array at the position
*/
public class Delete_EleAt_GivenLocation {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Ente initial size for linked list : ");
		int size = obj.nextInt();

		LinkedList<Integer> ll = new LinkedList<Integer>();

		System.out.println("Add element into linked list : ");
		for (int i = 0; i < size; i++) {
			ll.add(obj.nextInt());
		}

		System.out.println("Ente the index position to remove respective element : ");
		int pos = obj.nextInt();

		ll.remove(pos);

		// print the list
		for (Object temp : ll.toArray()) {
			System.out.print((Integer) temp + " ");
		}
		obj.close();

	}

}
