package methodOverLoading;

public class Calculator2 
{
	public void Calculator(int a,int b)
	{
		int sum=a+b;
		System.out.println("Addition:"+sum);
	}
	
	public void Calculator(int a,double b)
	{
		double sub=a-b;
		System.out.println("Substraction:"+sub);
	}
	public void Calculator(float a,float b)
	{
		 double mul=a*b;
		System.out.println("Multification:"+mul);
	}
	
	public static void main(String[] args) 
	{
		Calculator2 cal=new Calculator2();
		cal.Calculator(10, 20);
		cal.Calculator(10, 20.5);
		cal.Calculator(10.5f, 10.5f);
		
	}
}
