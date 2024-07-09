package com.exclude.digit;

import java.util.Scanner;
/*Free Coffee Cups

For each of the 6 coffee cups I buy, I get a 7th cup free. In total, I get 7 cups. 
Implement a program that takes n cups bought and print as an integer the total number of cups I would get.

input -------------> n number of cups from user
constraints -------> n>0
output ------------> number of cups present have

Buy 2 Get 1 Free ====> 

1 ----> 1
2 ----> 2+1
3 ----> 3+1
4 ----> 4+2
5 ----> 5+2
n ----> n+n/2


Buy 6 Cups 1 Free =====> n+n/6
*/
public class FreeCoffeeCups {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("The Number of cups you will bought : ");
		int no = scanner.nextInt();
		System.out.println("The Total Number of cups with offer : " + (no + no / 6));
		scanner.close();
	}

}
