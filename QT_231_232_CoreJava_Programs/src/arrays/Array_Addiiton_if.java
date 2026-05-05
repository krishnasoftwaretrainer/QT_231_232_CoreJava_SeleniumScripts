package arrays;

import java.util.Scanner;

public class Array_Addiiton_if {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// First Array
		System.out.println("First Array Row Size:");
		int frow = scan.nextInt();

		System.out.println("First Array Column Size:");
		int fcol = scan.nextInt();

		// First Array Declaration
		int a[][] = new int[frow][fcol];
		System.out.println("Enter First Array Elements: ");

		for (int i = 0; i < a.length; i++) // Row Size
		{
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = scan.nextInt();
			}
		}

		// Second Array
		System.out.println("Second Array Row Size:");
		int srow = scan.nextInt();

		System.out.println("Second Array Column Size:");
		int scol = scan.nextInt();

		// Second Array Declaration
		int b[][] = new int[srow][scol];
		System.out.println("Enter Second Array Elements: ");

		for (int i = 0; i < b.length; i++) // Row Size
		{
			for (int j = 0; j < b[0].length; j++) {
				b[i][j] = scan.nextInt();
			}
		}

		int sum[][] = new int[frow][fcol];
		if (frow == srow && fcol == scol)// 3 2
		{
			System.out.println("Addition of given Two ararys:");

			// sum[][]=a[][]+b[][]

			for (int i = 0; i < frow; i++)

			{
				for (int j = 0; j < fcol; j++) {
					sum[i][j] = a[i][j] + b[i][j];
					System.out.print(sum[i][j]+"   ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Addiiton is not possible");
		}
	}

}
