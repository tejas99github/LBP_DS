package com.array.self;

import java.util.Scanner;

/*LBP153: GARMENTS COMPANY APPAREL

The garments company apparel wishes to open outlets at various locations. 
The company shortlisted several plots in these locations and wishes to select 
only plots that are square shaped. 
Write an algorithm to help Apparel find the number of plots that it can select for its outlets.

*/
public class GarmentComp_Apparel {

	public static void main(String args[]) throws Exception {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = obj.nextInt();
		int i, j, c = 0;
		int a[] = new int[n];
		System.out.println("Enter the element");
		for (i = 0; i < n; i++)
			a[i] = obj.nextInt();
		
		for (i = 0; i < n; i++) {
			for (j = 1; j <= a[i]; j++) {
				if (j * j == a[i])
					c++;
			}
		}
		System.out.println(c);
		obj.close();
	}

}
