package com.array.basic;

import java.util.Scanner;

/*All Numbers In Array Are Prime
Create a function thats takes an array of integers and returns true if every number is prime. Otherwise, return false.
logic:
if all elements are prime count==size
*/
public class Check_PrimeNo_Array {

	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the size of array : ");
		int size = obj.nextInt();

		int a[] = new int[size];

		System.out.println("Enter element into array : ");
		for (int i = 0; i < size; i++) {
			a[i] = obj.nextInt();
		}

		int count = 0;

		for (int i = 0; i < size; i++) {
			if (isPrime(a[i])) {
				count++;
			}
		}

		System.out.println((count == size) ? "It is prime no array !" : "It is not prime no array !");
		obj.close();
	}

}
