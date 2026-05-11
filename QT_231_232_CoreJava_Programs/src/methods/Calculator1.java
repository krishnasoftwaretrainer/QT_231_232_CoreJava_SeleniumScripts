package methods;

public class Calculator1 
{
	//Accessmodifier returntype methodname(parameterlist)
	
	public void Addition() //Instance method
	{
		int a=10,b=20;
		int sum=a+b;
		System.out.println("Addition is: "+sum);
	}
	
	private static void Subtraction() //Static method:Classname.methodname();
	{
		int a=20,b=10;
		int sub=a-b;
		System.out.println("Subtraction is: "+sub);
	}
	
	protected void Multiplication()
	{
		int a=10,b=20;
		int mul=a*b;
		System.out.println("Multiplication is: "+mul);
	}
	
	 static void Division()  //default 
	{
		int a=20,b=10;
		int div=a/b;
		System.out.println("Division is: "+div);
	}
	public static void main(String[] args) 
	{
		//Method calling:Through object or through class name
		//Object:Classname objectname=new Classname();
		Calculator1 cal=new Calculator1();
		cal.Addition(); //objectname.methodname();
		Calculator1.Subtraction(); //Classname.methodname();
		cal.Multiplication();
		Calculator1.Division();
		
		
		//Calculator1.Addition();
		cal.Subtraction();
	}
}
