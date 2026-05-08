package methods;

public class WOR_WP 
{
	//2.WithOut ReturnType and With Parameters
	
	public static void Sub(int a, int b)
	{
		int sub=a-b;
		System.out.println("Substraction: "+sub);
	}
 
	public static void main(String[] args) 
	{
		WOR_WP.Sub(20, 10);
		WOR_WP.Sub(30, 10);
		WOR_WP.Sub(20, 10);
	}

}
