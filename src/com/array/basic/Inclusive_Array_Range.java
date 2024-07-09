package com.array.basic;

/*Write a function that, given the start startNum and end endNum values, return an array containing all the numbers inclusive to that range. 
Note:
The numbers in the array are sorted in ascending order.
If startNum is greater than endNum, return an array with the higher value. 
*/
import java.util.Scanner;

public class Inclusive_Array_Range {

	public static int[] generateRange(int startNum, int endNum) {
		// If startNum is greater than endNum, return an array with the higher value
		if (startNum > endNum) {
			return new int[] { startNum };
		}

		// Calculate the length of the array
		int length = endNum - startNum + 1;

		// Create the array
		int[] result = new int[length];

		// Fill the array with numbers inclusive to the range
		for (int i = 0; i < length; i++) {
			result[i] = startNum + i;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input startNum and endNum from the user
		System.out.print("Enter the start number: ");
		int startNum = scanner.nextInt();
		
		System.out.print("Enter the end number: ");
		int endNum = scanner.nextInt();

		// Generate the array using the function
		int[] result = generateRange(startNum, endNum);

		// Print the result
		System.out.print("Array containing numbers from " + startNum + " to " + endNum + ": ");
		for (int num : result) {
			System.out.print(num + " ");
		}

		scanner.close();
	}
}
