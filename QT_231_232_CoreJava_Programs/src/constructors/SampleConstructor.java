package constructors;

public class SampleConstructor 
{
	public SampleConstructor()
	{
		System.out.println("This is Sample Constructor");
	}
	
	public void SampleMethod()
	{
		System.out.println("This is Sample Method");
	}
	
	public static void main(String[] args)
	{
		//ClasName ObjName=new ConstructorName();
		SampleConstructor cons = new SampleConstructor();
		cons.SampleMethod();
	
	}
	

}
