package Looping_Statements;

public class NestedForLoop_Patterns {

	public static void main(String[] args) 
	{
		/*	1 2 3 4 5
			1 2 3 4 5
			1 2 3 4 5
			1 2 3 4 5
			1 2 3 4 5
		 */
		/*
		for(int i=1;i<=5;i++) //Outer Loop: Rows) 1 T
		{
			for(int j=1;j<=8;j++) //Inner Loop: Columns
			{
				System.out.print(j+" ");
			} //Exit 
			System.out.println();			
		} */
		/*Explanation:
		 * OuterLoop:i=1
		 * i<=5:1<=5:True
		 * InnerLoop:j=1
		 * j<=5:1<=5:True
		 * j++:j=2 , 2<=5:True
		 * j++:j=3 , 3<=5:True
		 * j++:j=4 , 4<=5:True
		 * j++:j=5 , 5<=5:True
		 * j++:j=6 , 6<=5:False inner loop exit
		 * 
		 * i++:i=2 , 2<=5:True Outer Loop 
		 * InnerLoop:j=1
		 * j<=5:1<=5:True
		 * j++:j=2 , 2<=5:True
		 * j++:j=3 , 3<=5:True
		 * j++:j=4 , 4<=5:True
		 * j++:j=5 , 5<=5:True
		 * j++:j=6 , 6<=5:False inner loop exit
		 * 
		 * i++:i=3 , 3<=5:True Outer Loop
		 * ----------
		 * ---------
		 * --------
		 * i++;i=6 , 6<=5:False Outer Loop Exit
		 * 
		 * 1   2   3  4    5 
		 * 
		 * 1   2   3  4    5
		 * 
		 * 1   2   3  4    5
		 */
		
		/*	1 	1	1	1	1
		 *  2	2	2	2	2
		 *  3	3	3	3	3
		 *  4	4	4	4	4
		 *  5	5	5	5	5
		 */
		/*
		for(int i=1;i<=5;i++) //Outer Loop: Rows) 1 T
		{
			for(int j=1;j<=5;j++) //Inner Loop: Columns
			{
				System.out.print(i+"    ");
			} //Exit 
			System.out.println();
		} */
		
		/* 5 	4	3	2	1
		 * 5	4	3	2	1
		 * 5	4	3	2	1
		 * 5	4	3	2	1
		 * 5	4	3	2	1
		 */
		/*
		
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=1;j--)
			{
				System.out.print(j+"    ");
			} 
			System.out.println();
		} */
		
		/* 
		 * 	*	*	*	*	*
		 * 	*	*	*	*	*
		 * 	*	*	*	*	*
		 * 	*	*	*	*	*
		 * 	*	*	*	*	*
		 */
		
		/*
		for(int i=1;i<=25;i++)
		{
			for(int j=1;j<=25;j++)
			{
				//System.out.print("  *   ");
				System.out.print(" ABCDE ");
				
			} 
			System.out.println();
	} */
		
		/* 1	
		 * 1	2
		 * 1	2	3
		 * 1	2	3	4
		 * 1	2	3	4	5
		 */
		
		/* 5
		 * 5	4
		 * 5	4	3
		 * 5	4	3	2
		 * 5	4	3	2	1
		 */
		/*
		for(int i=1;i<=5;i++)//1 2 3 4 5
		{
			for(int j=1;j<=i;j++) //1<=2 2<=2 3<=2:False exit
			{
				System.out.print(j+"    ");
			}
			System.out.println();
		} */
		
		//Print 2 to 10 Tables
		for(int i=5;i<=10;i++)
		{
			for(int j=1;j<=20;j++)
			{
				System.out.println(i +" * "+j +" = " +(i*j)+"    ");
			}
			System.out.println();
		}
		
	}
}
