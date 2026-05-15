package exception_Handling;

public class Checked_Exception_Try_Catch {

	public static void main(String[] args)
	{
		System.out.println(1);
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException ie)
		{
			System.out.println("Exception Handled");
			
		}
		System.out.println(2);
		
		
	}

}
