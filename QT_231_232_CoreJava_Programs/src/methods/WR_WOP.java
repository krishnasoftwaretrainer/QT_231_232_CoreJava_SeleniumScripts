package methods;

public class WR_WOP 
{
	public int  Mul()
	{
		int a=10,b=5;
		int mul=a*b;
		return mul;
		
	}
	
	public static void main(String[] args) 
	{
		WR_WOP wop=new WR_WOP();
		int muloutput=wop.Mul();
		System.out.println("Multification:"+muloutput);
		
		//System.out.println("Multification: "+wop.Mul());
		//System.out.println("Multification1: "+wop.Mul());
		
				
		
	}

}
