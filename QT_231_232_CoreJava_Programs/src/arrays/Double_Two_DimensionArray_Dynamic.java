package arrays;

import java.util.Scanner;

public class Double_Two_DimensionArray_Dynamic {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Row Size:");
		int row=scan.nextInt();
		
		System.out.println("Enter Column Size:");
		int col=scan.nextInt();
		
		int a[][]=new int[row][col];
		System.out.println("Enter Array Elements: ");
		
		for(int i=0;i<a.length;i++)  //Row Size 
		{
			for(int j=0;j<a[0].length;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("Given Array is");
		
		for(int i=0;i<a.length;i++)  //Rows 3
		{
			for(int j=0;j<a[0].length;j++) //Columns 3
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}	
			
		/*
		System.out.println("Enter Row Size:");
		int row=scan.nextInt();
		
		System.out.println("Enter Column Size:");
		int col=scan.nextInt();
		
		
		int a[][]=new int[row][col];
		System.out.println("Enter Array Elements: ");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("Given Array is");
		
		for(int i=0;i<row;i++)  //Rows 3
		{
			for(int j=0;j<col;j++) //Columns 3
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
				
		} */
	}

}
