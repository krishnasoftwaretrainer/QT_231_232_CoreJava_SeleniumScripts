package conditional_Statements;

import java.util.Scanner;

public class BloodDonation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter your weight: ");
		int weight = sc.nextInt();
		
		if(age>=18 && weight>=40) 
		{
			System.out.println("You are eligible for blood donation");
		}
		else
		{
			System.out.println("You are not eligible");
		}
		
		
		
	}

}
