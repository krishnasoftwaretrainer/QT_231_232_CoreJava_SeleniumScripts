package conditional_Statements;
import java.util.Scanner;
public class NestedIf_BloodDonation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		if(age>=18) //Outer T
		{
			System.out.println("Enter your weight: ");
			int weight = sc.nextInt();
			
			if(weight>=40) //Inner T 
			{
				System.out.println("You are eligible for blood donation");
			}
			else
			{
				System.out.println("Your weight is less than 40 kg, you are not eligible for blood donation");
			}
			
		}
		else
		{
			System.out.println("Your age is less than 18 years, you are not eligible for blood donation");
		}
		
		
	}

}
