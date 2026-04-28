package conditional_Statements;
import java.util.Scanner;
public class Positive_Negative {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter any Number:");
		int num=scan.nextInt(); //22
		
		if(num<0)
		{
			System.out.println(num +" is a Negative Number");
		}
		
		else
		{
			System.out.println(num+" is a Positive Number");
		}
		
		/*
		if(num>=0)
		{
			System.out.println(num+" is a Positive Number");
		}
				
		else
		{
			System.out.println(num+" is a Negative Number");
		}
		*/
		
		/*
		if(num>0)  //0>0
		{
			System.out.println(num+" is a Positive Number");
		}
		
		else if(num<0)
		{
			System.out.println(num+" is a Negative Number");
		}
		
		else
		{
			System.out.println(num+" is Zero");
		}
		
		*/
		
		
	}

}
