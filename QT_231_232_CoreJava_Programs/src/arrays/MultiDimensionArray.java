package arrays;

import java.util.Scanner;

public class MultiDimensionArray
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		//First Array
		System.out.println("First Array Row Size:");
		int frow=scan.nextInt();
		
		System.out.println("First Array Column Size:");
		int fcol=scan.nextInt();
		
		//First Array Declaration
		int a[][]=new int[frow][fcol];
		System.out.println("Enter First Array Elements: ");
		
		for(int i=0;i<a.length;i++)  //Row Size 
		{
			for(int j=0;j<a[0].length;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		
		//Second Array
		System.out.println("Second Array Row Size:");
		int srow=scan.nextInt();
		
		System.out.println("Second Array Column Size:");
		int scol=scan.nextInt();
		
		//Second Array Declaration
		int b[][]=new int[srow][scol];
		System.out.println("Enter Second Array Elements: ");
		
		for(int i=0;i<b.length;i++)  //Row Size 
		{
			for(int j=0;j<b[0].length;j++)
			{
				b[i][j]=scan.nextInt();
			}
		}
		
		//Print Two Arrays
		
		System.out.println("First Array is");
		
		for(int i=0;i<a.length;i++)  //Rows 3
		{
			for(int j=0;j<a[0].length;j++) //Columns 3
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
		
		System.out.println("Second Array is");
		
		for(int i=0;i<b.length;i++)  //Rows 3
		{
			for(int j=0;j<b[0].length;j++) //Columns 3
			{
				System.out.print(b[i][j]+"   ");
			}
			System.out.println();
		}
	}

}
