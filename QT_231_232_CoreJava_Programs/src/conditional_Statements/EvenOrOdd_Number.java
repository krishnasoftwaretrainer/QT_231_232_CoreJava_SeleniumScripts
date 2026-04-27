package conditional_Statements;

import java.util.Scanner;

public class EvenOrOdd_Number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter any Number:");
		int number=scan.nextInt();
		
		/*
		if(number%2==0)//6%2==0 True[Even] 7%2==0 False[Odd]
		{
			System.out.println( number + " is Even Number");
		}
		else
		{
			System.out.println( number + " is Odd Number");
		} */
		
		if(number%2==1) //30%2==1 F 31%2==1 T
		{
			System.out.println( number + " is Odd Number");
		}
		else
		{
			System.out.println( number + " is Even Number");
		}
		
		
	}

}
