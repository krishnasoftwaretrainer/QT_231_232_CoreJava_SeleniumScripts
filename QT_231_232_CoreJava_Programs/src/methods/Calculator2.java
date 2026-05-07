package methods;

public class Calculator2   //+ - * / %
{
	public void Modulus()
	{
		int a=20,b=10;
		int mod=a%b;
		System.out.println("Modulus is: "+mod);
	}	
	
	public static void main(String args[])
	{
		Calculator1 cal1=new Calculator1();
		cal1.Addition();
		Calculator1.Subtraction();
		cal1.Multiplication();
		Calculator1.Division();
		Calculator2 cal2=new Calculator2();
		cal2.Modulus();
	}
}
