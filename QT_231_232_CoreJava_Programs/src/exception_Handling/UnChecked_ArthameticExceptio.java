package exception_Handling;

public class UnChecked_ArthameticExceptio {

	public static void main(String[] args) 
	{
		/*
		System.out.println("Division Started");
		//System.out.println(5/2);
		System.out.println(5/0);
		System.out.println("Division Completed");
		System.out.println("Thank you");
		*/
		
		try
		{
			System.out.println("Division Started");
			System.out.println(5+2);
			System.out.println(5-2);
			System.err.println(5*2);
			System.out.println(5/0); //2 AE 
				
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Division Completed");
			System.out.println("Arthematic Exception"+ae.getMessage());
						
		}
		
		finally
		{
			System.out.println("Thank you");
		}
	}

}
