package com.digits;

import java.util.Scanner;

public class PinGenerationCustom {

	public static int[] findPlaces(int number) {
		int unitPlace = number % 10;
		int tensPlace = (number / 10) % 10;
		int hundredPlace = (number / 100) % 10;

		int[] places = { unitPlace, tensPlace, hundredPlace };
		return places;
	}

	public static int findMin(int num1, int num2, int num3) {
		int min = num1;

		if (num2 < min) {
			min = num2;
		}

		if (num3 < min) {
			min = num3;
		}

		return min;
	}

	public static int findMax(int num1, int num2, int num3) {
		int max = num1;

		if (num2 > max) {
			max = num2;
		}

		if (num3 > max) {
			max = num3;
		}

		return max;
	}

	public static int maxDigit(int n) {
		int max = 0;
		while (n != 0) {
			if (n % 10 > max) {
				max = n % 10;
			}
			n = n / 10;
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		int n1 = obj.nextInt();
		int[] firstNo = findPlaces(n1);
		int f1 = firstNo[0];
		int f2 = firstNo[1];
		int f3 = firstNo[2];

		System.out.println("Enter the 2nd number : ");
		int n2 = obj.nextInt();
		int[] secondNo = findPlaces(n2);
		int s1 = secondNo[0];
		int s2 = secondNo[1];
		int s3 = secondNo[2];

		System.out.println("Enter the 3rd number : ");
		int n3 = obj.nextInt();
		int[] thirdNo = findPlaces(n3);
		int t1 = thirdNo[0];
		int t2 = thirdNo[1];
		int t3 = thirdNo[2];

		int min1 = findMin(f1, s1, t1);
		int min2 = findMin(f2, s2, t2);
		int min3 = findMin(f3, s3, t3);

		int max1 = maxDigit(n1);
		int max2 = maxDigit(n2);
		int max3 = maxDigit(n3);

		int maxAll = findMax(max1, max2, max3);

		int pin = maxAll * 1000 + min3 * 100 + min2 * 10 + min1;

		System.out.println(pin);

		obj.close();
	}

}
