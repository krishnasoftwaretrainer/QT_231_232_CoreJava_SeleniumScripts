package exception_Handling;

public class UnChecked_ArrayOutOfBoundException {

	public static void main(String[] args) {
		/*
		 * int a[]= {10,20,30,40,50};
		 * 
		 * for(int i=0;i<8;i++) { System.out.println(a[i]); }
		 */

		try {
			int a[] = { 10, 20, 30, 40, 50 };

			for (int i = 0; i < 5; i++) {
				System.out.println(a[i]);
			}
		} 
		catch (ArrayIndexOutOfBoundsException aibe) 
		{
			System.out.println(aibe.getMessage());
			System.out.println("Exception Handled Successfully");

		}
		finally
		{
			System.out.println("ThankYou");
		}

	}

}
