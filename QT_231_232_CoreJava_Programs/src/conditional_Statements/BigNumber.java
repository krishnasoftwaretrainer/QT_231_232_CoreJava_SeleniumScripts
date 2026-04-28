package conditional_Statements;

import java.util.Scanner;

public class BigNumber 
{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter any Two Numbers:");
		int num1=scan.nextInt(); 
		int num2=scan.nextInt();
		
		if(num1>num2 && num1!=num2) //(55>55 && 55!=55) 
		{
			System.out.println(num1 + " is Big Number");
		}
		else
		{
			System.out.println(num2 + " is Big Number");
			System.out.println("Both Numbers are Equal");
		}
	}

}
