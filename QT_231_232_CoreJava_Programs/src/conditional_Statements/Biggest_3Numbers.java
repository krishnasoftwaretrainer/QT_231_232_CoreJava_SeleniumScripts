package conditional_Statements;
import java.util.Scanner;
public class Biggest_3Numbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any 3 Numbers");
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		//6 3 8  3 5 8 
		if(a>b) //Outer Condition 6>3 T  3>5 F
		{
			if(a>c) //Inner Condition 6>2 T 6>8 
			{
				System.out.println(a +" :a is Biggest Number");
			}
			else //Inner Condition else
			{
				System.out.println(c+" :c is Biggest Number");
			}
		}
		
		else if(b>c)  //Outer Condition else 
		{
			System.out.println(b+" :b is Biggest Number");
		}
		
		else
		{
			System.out.println(c+" :c is Biggest Number");
		}
		
	}

}
