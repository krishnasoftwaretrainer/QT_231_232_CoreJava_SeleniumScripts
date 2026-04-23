package java_Tokens;

import java.util.Scanner;

public class Memory_Numeric_DataTypes {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//byte num1=128;  //1byte 
		//short num1=32768;  //2bytes
		//int num1=2147483648;
		//long num1=2147483648l;
		
		//float num1=125.74568688452132f;
		//double num1=125.12345678901234554545d;
		System.out.println("Enter  Value: ");
		//byte num1=scan.nextByte();
		//short num1=scan.nextShort();
		//int num1=scan.nextInt();
		//long num1=scan.nextLong();
		
		//float num1=scan.nextFloat();
		//double num1=scan.nextDouble();
		//char num1='AB';
		//char num1=scan.next().charAt(0);
		
		//String num1="ABCDEFGH";
		//String num1=scan.next();		
		//String num1=scan.nextLine();
		
		//boolean num1=true;
		boolean num1=scan.nextBoolean();
		System.out.println(num1);
		
		scan.close();
	}

}
