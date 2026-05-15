package exception_Handling;

public class UnChecked_NullPointer
{
	public static void main(String[] args) {
		
		/*
		//String name="Krishna";
		String name=null;
		System.out.println(name.length());
		*/
		
		try
		{
			//String name="abcd";
			String name=null;
			System.out.println(name.length());
			
		}
		catch(NullPointerException npe)
		{
			System.out.println(npe.getMessage());
			System.out.println("Exception Handled");
		}
		finally
		{
			System.out.println("ThankYou");
		}
	}

}
