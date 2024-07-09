package com.digits;

public class PowerOfNo {

	public static long pow(int x, int y) {
		if (y == 0) {
			return 1;
		}
		return pow(x, y - 1) * x;

	}

	public static void main(String[] args) {
		System.out.println(pow(5, 8));
	}

}
