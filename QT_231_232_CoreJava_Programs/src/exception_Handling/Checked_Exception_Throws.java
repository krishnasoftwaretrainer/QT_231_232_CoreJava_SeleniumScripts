package exception_Handling;

public class Checked_Exception_Throws {

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println(1);
		Thread.sleep(5000);
		System.out.println(2);
		Thread.sleep(5000);
		System.out.println(3);
		
		//Unhandled exception type InterruptedException
	}

}
