package com.freq;

import java.util.Scanner;

/*LBP264 : power function

In a mathematics class, the students are beign taught power function. 
So "a" raised to the power of "b" is shown as a^b and the calculatation goes as a*a*a...b times. 
Now there is slight twist to the problem, 
the students have to find out the last digit of the resultant a^b. 

input -----> an integer value as base and power
con -------> no
output ----> last digit of a^b

4,2 ---> 16 ---> 6
2,10 --> 1024 -> 4
*/
public class Power_NO {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the base : ");
		int a = obj.nextInt();
		System.out.println("Ente ther power : ");
		int b = obj.nextInt();
		obj.close();
		System.out.println(((int) Math.pow(a, b)) % 10);
	}

}
