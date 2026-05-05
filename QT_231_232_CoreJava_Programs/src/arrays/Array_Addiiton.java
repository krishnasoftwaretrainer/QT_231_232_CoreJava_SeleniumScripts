package arrays;

import java.util.Scanner;

public class Array_Addiiton 
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// First Array
		System.out.println("Array Row Size:");
		int row = scan.nextInt();

		System.out.println("Array Column Size:");
		int col = scan.nextInt();

		// First Array Declaration
		int a[][] = new int[row][col];
		System.out.println("Enter First Array Elements: ");

		for (int i = 0; i < a.length; i++) // Row Size
		{
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = scan.nextInt();
			}
		}

		// Second Array
		
		// Second Array Declaration
		int b[][] = new int[row][col];
		System.out.println("Enter Second Array Elements: ");

		for (int i = 0; i < b.length; i++) // Row Size
		{
			for (int j = 0; j < b[0].length; j++) {
				b[i][j] = scan.nextInt();
			}
		}

		int sum[][] = new int[row][col];
		System.out.println("Addition of given Two ararys:");

			// sum[][]=a[][]+b[][]

			for (int i = 0; i < sum.length; i++)

			{
				for (int j = 0; j < sum[0].length; j++) {
					sum[i][j] = a[i][j] + b[i][j];
					System.out.print(sum[i][j]+"   ");
				}
				System.out.println();
			}
		
	}
	
		
	}



