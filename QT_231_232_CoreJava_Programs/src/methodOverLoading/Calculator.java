package methodOverLoading;

public class Calculator 
{
	public void Addition(int a,int b)
	{
		int sum=a+b;
		System.out.println("Addition:"+sum);
	}
	
	public void Addition(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println("Addition:"+sum);
	}
	public void Addition(int a,int b,int c,int d)
	{
		int sum=a+b+c+d;
		System.out.println("Addition:"+sum);
	}
	
	public static void main(String[] args) 
	{
		Calculator cal=new Calculator();
		cal.Addition(10, 20);
		cal.Addition(10, 20, 30);
		cal.Addition(10, 20, 30, 40);
		
	}
}
