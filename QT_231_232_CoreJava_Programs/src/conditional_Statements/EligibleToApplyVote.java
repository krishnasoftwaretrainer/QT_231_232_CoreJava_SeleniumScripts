package conditional_Statements;

import java.util.Scanner;

public class EligibleToApplyVote {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your age here:");
		int age=scan.nextInt(); //18
		
		if(age>=18) //18>=18 True 17>=18 False
		{
			System.out.println("Your Eligible to Apply for Vote");
			System.out.println("Please Complete next Steps to Apply for Vote");
		}
		else
		{
			System.out.println("Sorry! Your age is "+ age + ",Your Not Eligible to Apply for Vote");
			System.out.println("Please wait for 18 years to apply for Vote");
			//FBS
		}
		
	}

}
