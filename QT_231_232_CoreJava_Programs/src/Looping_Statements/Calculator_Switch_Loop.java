package Looping_Statements;
import java.util.Scanner;
public class Calculator_Switch_Loop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=4;i++)
		{
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("CALCULATOR");
		System.out.println("Addition");
		System.out.println("Subtraction");
		System.out.println("Multiplication");
		System.out.println("Division");
		System.out.println("Modulus Division");
		
		System.out.println("Enter your choice: ");
		String choice = sc.next().toLowerCase();

		switch(choice)
		{
		case "addition":
		{
			int sum = num1 + num2;
			System.out.println("Result: " + sum);
			break;
		}
		
		case "subtraction":
		{
			int sub = num1 - num2;
			System.out.println("Result: " + sub);
			break;
		}
		
		case "multiplication":
		{
			int mul = num1 * num2;
			System.out.println("Result: " + mul);
			break;
		}
		
		case "division":
		{
			if(num2 != 0)
			{
				int div = num1 / num2;
				System.out.println("Result: " + div);
			}
			else
			{
				System.out.println("Error: Division by zero is not allowed.");
			}
			break;
		}
		
		case "modulus":
		{
			if(num2 != 0)
			{
				int mod = num1 % num2;
				System.out.println("Result: " + mod);
			}
			else
			{
				System.out.println("Error: Division by zero is not allowed.");
			}
			break;
		}
		
		default:
		{
			System.out.println("Invalid choice");
		}
		}
		/*
		System.out.println("Enter your choice");
		char choice = sc.next().charAt(0);
		
		switch(choice)
		{
		case '+':
		{
			int sum = num1 + num2;
			System.out.println("Addition: " + sum);
			break;
		}
		
		case '-':
		{
			int sub = num1 - num2;
			System.out.println("Subtraction: " + sub);
			break;
		}
		
		case '*':
		{
			int mul = num1 * num2;
			System.out.println("Multiplication: " + mul);
			break;
		}
		
		case '/':
		{
			if(num2 != 0)
			{
				int div = num1 / num2;
				System.out.println("Division: " + div);
			}
			else
			{
				System.out.println("Error: Division by zero is not allowed.");
			}
			break;
		}
		default:
		{
			System.out.println("Invalid choice");
		}
		
		*/
		
		/*
		System.out.println("Enter your choice (1-4): ");
		byte choice = sc.nextByte();
		
		switch(choice)
		{
		case 1:
		{
			int sum = num1 + num2;
			System.out.println("Addition: " + sum);
			break;
		}
		
		case 2:
		{
			int sub = num1 - num2;
			System.out.println("Subtraction: " + sub);
			break;
		}
		
		case 3:
		{
			int mul = num1 * num2;
			System.out.println("Multiplication: " + mul);
			break;
		}
		
		case 4:
		{
			
			int div = num1 / num2;
			System.out.println("Division: " + div);
			break;
		}
		
		default:
		{
			System.out.println("Invalid choice");
		}
			*/
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

