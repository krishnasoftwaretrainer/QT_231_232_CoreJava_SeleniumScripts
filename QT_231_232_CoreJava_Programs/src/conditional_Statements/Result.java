package conditional_Statements;
import java.util.Scanner;
public class Result {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Obtained Marks:");
		int Obtainedmarks=scan.nextInt(); 
		
		if(Obtainedmarks>=35 && Obtainedmarks<=100)
		{
			System.out.println("Passed");
		}
		else if(Obtainedmarks>=0 & Obtainedmarks<35)
			{
			System.out.println("Failed");
		}
		else
		{
			System.out.println("Invalid Marks");
		}
		
	}

}
