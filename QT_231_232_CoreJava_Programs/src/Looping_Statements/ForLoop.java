package Looping_Statements;

public class ForLoop {

	public static void main(String[] args) {
	 // Printing 1 to 1000000 without using loop
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		*/
		/*
		for(int i=1;i<=1000;i++)
		{
			System.out.println(i);
		} */
		
		
			/*i=1; 1<=10; T i++=> i=2
			 * i=2; 2<=10; T i++=> i=3
			 * i=3; 3<=10; T i++=> i=4
			 * -----------------
			 * i=10; 10<=10; T i++=> i=11
			 * i=11; 11<=10; F
			 *Output:
			 * 1
			 * 2
			 * 3
			 * -
			 * -
			 * 10
			 */
		//10 to 1
		/*
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		} */
		/*
		for(int i=10;i>=1;i++)
		{
			System.out.println("Quality Thoughts");
		} */
		
		// 1 3 5 7 9  Odd numbers from 1 to 10
		/*
		for(int i=1;i<=10;i+=2)
		{
			System.out.println(i);
		} */
		//1<=10; T i+=2=> i=3 3<=10; T i+=2=> i=5 5<=10; T i+=2=> i=7 7<=10; T i+=2=> i=9 9<=10; T i+=2=> i=11 11<=10; F
		
		//Even numbers from 1 to 10 , 2 4 6 8 10
		/*
		for(int i=2;i<=100;i+=2)
		{
			System.out.println(i);
		} */
		/*
		for(int i=10;i>=-100;i-=10)
		{
			System.out.println(i);
		} */
		
		//5th Table
		
		for(int i=1;i<=10;i++) //1<=20:true 
		{
			System.out.println("10 * " +i +" = " + (10*i));
		} 
		
		
	

	}

}
