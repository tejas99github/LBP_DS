package com.string;

import java.util.Scanner;

/*Given a string s, and an integer array indices of the same length. 
The string s will be shuffled such that the character at 
the ith position moves to indices[i] in the shuffled string, 
return shuffled string.*/
public class StringShuffler {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input string
		System.out.print("Enter the string: ");
		String s = scanner.nextLine(); // sun //s.lenght -> 3

		// Input array of indices
		int[] indices = new int[s.length()];

		System.out.print("Enter the array of indices (separated by space, same length as string): ");
		String indicesInput = scanner.nextLine(); // 1 0 2 //indicesInput.length->5

		int index = 0;
		int num = 0;

		for (int i = 0; i < indicesInput.length(); i++) { // 0<5, 1<5 , 2<5, 3<5, 4<5, 5<5

			char c = indicesInput.charAt(i); // char c = 1, (''), 0, (''), 2

			if (c >= '0' && c <= '9') {

				// num=num..... -> used to convert a sequence of characters representing a
				// number into an actual integer value

				num = num * 10 + (c - '0'); // num = 0+(49-48)=1, 0+(48-48)=0, 0+(50-48)=2

			} else if (c == ' ' && index < indices.length) { // 0<3, 1<3

				indices[index++] = num; // indices[0++]=1, indices[1++]=0,

				num = 0;
			}
		}
		if (index < indices.length) { // 2<3
			indices[index] = num; // indices[2]=2
		}

		// Call the shuffleString method
		String shuffledString = shuffleString(s, indices);
		System.out.println("Shuffled string: " + shuffledString);

		scanner.close();
	}

	public static String shuffleString(String s, int[] indices) {
		char[] shuffled = new char[s.length()];

		// Iterate through the characters of the original string
		for (int i = 0; i < s.length(); i++) {
			// Place the character at the i-th position in the original string
			// at the position specified by indices[i] in the shuffled string //
			// indices[0]=1 indices[1]=0 indices[2]=2
			shuffled[indices[i]] = s.charAt(i); // shuffled[1]=u , shuffled[0]=s, shuffled[2]=n
		}

		// Convert the char array to a string and return
		return new String(shuffled); // usn
	}
}