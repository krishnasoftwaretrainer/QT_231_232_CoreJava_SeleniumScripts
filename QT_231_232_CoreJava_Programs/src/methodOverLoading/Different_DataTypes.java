package methodOverLoading;

public class Different_DataTypes 
{
	public void Addition(int a, int b)
	{
		int sum=a+b;
		System.out.println("Sum:"+sum);
	}
	
	public void Addition(double a, double b )
	{
		double sum=a+b;
		System.out.println("Sum:"+sum);
	}
	
	public void Addition(float a, float b)
	{
		float sum=a+b;
		System.out.println("Sum:"+sum);
	}
		
	public static void main(String[] args) 
	{
		Different_DataTypes ddt=new Different_DataTypes();
		ddt.Addition(10, 20);
		ddt.Addition(1.5f, 2.5f);
		ddt.Addition(2.5, 2.5);
		
		
		
	}
}
