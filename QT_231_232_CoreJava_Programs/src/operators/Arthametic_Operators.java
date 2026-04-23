package operators;

import java.util.Scanner;
public class Arthametic_Operators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int a=10;
		//int b=20;
		float a=10.5f, b=20.3f;
		//System.out.println("Enter any two numbers: ");
		//int a = sc.nextInt();
		//int b = sc.nextInt();		
		
		System.out.println("Addition: " + (a+b));
		System.out.println("Subtraction: " + (a-b));
		System.out.println("Multiplication: " + (a*b));
		System.out.println("Division: " + (a/b)); //0
		System.out.println("Modulus: " + (a%b)); //
		System.out.println("=====================================");
		
		System.out.println("Addition: " + (30+40)); //30
		System.out.println("Subtraction: " + (30-40)); //10
		System.out.println("Multiplication: " + (30*40)); //200
		System.out.println("Division: " + (30/40)); //2
		System.out.println("Modulus: " + (30%40)); //0

		System.out.println("=====================================");
		//Combine all Arithmetic Operators
		
		int result= 10 + 20 * 3 -15 +3;  //58 78
		System.out.println("Result: " + result); //58
		
	}

}
