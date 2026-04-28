package conditional_Statements;
import java.util.Scanner;
public class Calculator_Switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("CALCULATOR");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		System.out.println("Enter your choice (1-4): ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			int sum = num1 + num2;
			System.out.println("Result: " + sum);
		}
		
		case 2:
		{
			int sub = num1 - num2;
			System.out.println("Result: " + sub);
		}
		
		case 3:
		{
			int mul = num1 * num2;
			System.out.println("Result: " + mul);
		}
		
		case 4:
		{
			
			int div = num1 / num2;
			System.out.println("Result: " + div);
		}
			
			/*
			if(num2 != 0)
			{
				int div = num1 / num2;
				System.out.println("Result: " + div);
			}
			else
			{
				System.out.println("Error: Division by zero is not allowed.");
			} */
		}
		
	}

	}

