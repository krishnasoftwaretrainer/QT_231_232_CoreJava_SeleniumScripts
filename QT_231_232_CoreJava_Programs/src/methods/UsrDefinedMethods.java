package methods;

public class UsrDefinedMethods 
{
	public void Addiiton()
	{
		int a=20,b=20;
		int c=a+b;
		System.out.println("Addition: "+c);
	}
	
	
	private static void Sub(int a, int b)
	{
		int sub=a-b;
		System.out.println("Substraction: "+sub);
	}
	
	public int  Mul()
	{
		int a=10,b=5;
		int mul=a*b;
		return mul;
		
	}
	
	public double div(double a, double b)
	{
		double divv=a/b;
		return divv;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("WithOut ReturnType and WithOut Parameters");
		WOR_WOP worwop=new WOR_WOP();
		worwop.Addiiton();
		System.out.println();
		
		System.out.println("WithOut ReturnType and With Parameters");
		WOR_WP.Sub(20, 10);
		WOR_WP.Sub(30, 10);
		WOR_WP.Sub(20, 10);
		System.out.println();
		
		System.out.println("With ReturnType and Without Parameters");
		WR_WOP wop=new WR_WOP();
		int muloutput=wop.Mul();
		System.out.println("Multification:"+muloutput);
		System.out.println();
		
		System.out.println("With ReturnType and With Parameters");
		WR_WP wrwp=new WR_WP();
		System.out.println("Division: "+wrwp.div(20, 10) );
		System.out.println("Division: "+wrwp.div(55, 22) );
		System.out.println("Division: "+wrwp.div(100, 2) );
		
		
	}


}
