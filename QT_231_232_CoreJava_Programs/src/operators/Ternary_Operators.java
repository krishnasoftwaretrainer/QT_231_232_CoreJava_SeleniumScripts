package operators;
import java.util.Scanner;
public class Ternary_Operators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int Obtained_Marks=80;
	
		System.out.println("Enter Obtained Marks: ");
		int Obtained_Marks=sc.nextInt();
	//boolean result=Obtained_Marks>=35 ? true:false;
	String result=Obtained_Marks>=35 ? "Pass":"Fail";
	
	System.out.println("Result: " + result);
	
	sc.close();

	}

}
