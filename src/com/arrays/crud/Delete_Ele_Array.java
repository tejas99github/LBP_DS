package com.arrays.crud;

import java.util.LinkedList;
import java.util.Scanner;

/*delete an element from an array 
Implement a program to delete the given element from an array 
*/
public class Delete_Ele_Array {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Ente initial size for linked list : ");
		int size = obj.nextInt();

		LinkedList<Integer> ll = new LinkedList<Integer>();

		System.out.println("Add element into linked list : ");
		for (int i = 0; i < size; i++) {
			ll.add(obj.nextInt());
		}

		System.out.println("Ente the Element to delete form list : ");
		int ele = obj.nextInt();

		if (ll.remove(new Integer(ele))) {
			// print the list
			for (Object temp : ll.toArray()) {
				System.out.print((Integer) temp + " ");
			}
		} else {
			System.out.println(-1);
		}

		obj.close();

	}

}
