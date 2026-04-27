package conditional_Statements;
import java.util.Scanner;
public class ElseIf_LadderIf {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Obtained Marks:");
		int Obtainedmarks=scan.nextInt(); //55
		
		if(Obtainedmarks>=85 && Obtainedmarks<=100)
			//200>=85 && 200<=100 T F: False
		{
			System.out.println("Distinction");
		} //Exit
		
		else if(Obtainedmarks>=60 && Obtainedmarks<85) //55>=60 && 55<=84 F T: False
		{
			System.out.println("First Class");
		}
		//Exit 
		else if(Obtainedmarks>=55 && Obtainedmarks<60) //55>=55 && 55<=59 T T: True
		{
			System.out.println("Second Class");
		}
		
		else if(Obtainedmarks>=40 && Obtainedmarks<55) //55>=40 && 55<=54 T F: False
		{
			System.out.println("Third Class");
		}
		
		else if(Obtainedmarks>=35 && Obtainedmarks<40) //55>=35 && 55<=39 T F: False
		{
			System.out.println("Passed");
		}
		
		else if(Obtainedmarks>=0 && Obtainedmarks<35) //55>=0 && 55<=34 T F: False
		{
			System.out.println("Failed");
		}
		
		else
		{
			System.out.println("Invalid Marks");
		}
	}

}
