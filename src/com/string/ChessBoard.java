package com.string;

import java.util.Scanner;

/*Determine the color of a chess board square
You are given coordinates, a string that represents the coordinates of a square of the chess board.
Return True if the saquare is in white, and false if the square is in Black.
The coordinates will always represent a valid chess board square. 
The coordinates will always have the letter first, and the number second.
a1 is black.( 8*8 chessboard)
*/
public class ChessBoard {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter String Constraints : ");
		String s = obj.nextLine();
		int x = s.charAt(0) - 96;
		int y = s.charAt(1);
		System.out.println(x % 2 != y % 2);

		obj.close();
	}

}

/*
 * In chessboards, the colors alternate in a checkerboard pattern, with the
 * top-left square typically being black. Therefore, squares of the same color
 * will either have both even or both odd coordinates. Considering this, if the
 * sum of the remainders of the column and row numbers divided by 2 is:
 * 
 * 0 (even + even or odd + odd), it indicates a square of the same color. 1
 * (even + odd or odd + even), it indicates squares of different colors. Thus, x
 * % 2 != y % 2 checks whether the remainders are different, indicating squares
 * of different colors. If they are different, the square is white; if they are
 * the same, the square is black. So, assigning the result of this expression to
 * isWhite provides a boolean value indicating whether the square is white
 * (true) or black (false).
 */