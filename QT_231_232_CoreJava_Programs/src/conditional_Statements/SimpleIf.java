package conditional_Statements;

import java.util.Scanner;
public class SimpleIf {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Obtained Marks:");
		int Obtainedmarks=scan.nextInt(); //55
		
		//Simple if statement[TBS]
		
		if(Obtainedmarks>=35) //55>=35 True 25>=35 False
		{
			System.out.println("Congratulations! You are Passed");
			//TBS
		}
		
		
		
		
	}

}
