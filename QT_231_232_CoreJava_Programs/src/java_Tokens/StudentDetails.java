package java_Tokens;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		//Student details Static Variables
		
		/*
		int studentId=12345;
		float studentMarks=85.75f;
		char studentGrade='A';
		String studentName="John Doe";
		boolean isPassed=true;
		
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Marks: " + studentMarks);
		System.out.println("Student Grade: " + studentGrade);
		System.out.println("Student Name: " + studentName);
		System.out.println("Is Passed: " + isPassed);
		
		*/
		
		//Student details Dynamic Variables
		System.out.println("Enter Student ID: ");
	   byte studentId=scan.nextByte();
	   System.out.println("Enter Student Marks: ");
	   float studentMarks=scan.nextFloat();
	   System.out.println("Enter Student Grade: ");
	   char studentGrade=scan.next().charAt(0);
	   System.out.println("Enter Student Name: ");
	   String studentName=scan.next();	
	   System.out.println("Result: ");
	   boolean isPassed=scan.nextBoolean();
	   
	   System.out.println("Student ID: " + studentId);
	   System.out.println("Student Marks: " + studentMarks);
	   System.out.println("Student Grade: " + studentGrade);
	   System.out.println("Student Name: " + studentName);
	   System.out.println("Result: " + isPassed);
	}

}
