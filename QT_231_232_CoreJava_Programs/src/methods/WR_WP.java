package methods;

public class WR_WP 
{
	public double div(double a, double b)
	{
		double divv=a/b;
		return divv;
	}
	public static void main(String[] args) 
	{
		
		WR_WP wrwp=new WR_WP();
		System.out.println("Division: "+wrwp.div(20, 10) );
		System.out.println("Division: "+wrwp.div(55, 22) );
		System.out.println("Division: "+wrwp.div(100, 2) );
		
		
	}

}
