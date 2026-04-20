package basic_Programs;

import java.util.Scanner;

public class Addition2Num_Dynamic_Float {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Float Value:");
		float num1=scan.nextFloat();
		System.out.print("Enter Second Float Value:");
		float num2=scan.nextFloat();
		
		float sum=num1+num2;
		float sub=num1-num2;
		float mul=num1*num2;
		float div=num1/num2;
		
		System.out.println("Addiiton: "+sum); //
		System.out.println("Substraction: "+sub);
		System.out.println("Multification: "+mul);
		System.out.println("Division: "+div);

	}

}
