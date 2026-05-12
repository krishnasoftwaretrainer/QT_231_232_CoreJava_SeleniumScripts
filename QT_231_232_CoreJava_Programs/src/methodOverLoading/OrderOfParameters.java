package methodOverLoading;

public class OrderOfParameters 
{
	public void Addition(int a, double b)
	{
		double sum=a+b;
		System.out.println("Addition:"+sum);
	}
	
	public void Addition(double a, int b)
	{
		double sum=a+b;
		System.out.println("Addition:"+sum);
	}
	
	public static void main(String[] args) 
	{
		OrderOfParameters ofp=new OrderOfParameters();
		ofp.Addition(10, 2.5);
		ofp.Addition(2.5, 10);
	}

}
