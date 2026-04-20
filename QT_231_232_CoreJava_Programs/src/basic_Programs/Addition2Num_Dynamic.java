package basic_Programs;

import java.util.Scanner;

public class Addition2Num_Dynamic 
{
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Value:");
		int num1=scan.nextInt();
		System.out.print("Enter Second Value:");
		int num2=scan.nextInt();
		
		int sum=num1+num2;
		
		System.out.println("Addiiton: "+sum); //
		
	}

}
