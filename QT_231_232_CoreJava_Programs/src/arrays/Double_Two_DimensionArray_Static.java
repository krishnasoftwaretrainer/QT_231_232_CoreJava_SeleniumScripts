package arrays;

public class Double_Two_DimensionArray_Static {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3,9},{4,5,6,9},{7,8,9,9}}; //3*3=9
		
		System.out.println("Given Array is");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				
			System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}

		
		/*
		for(int i=0;i<3;i++)  //Rows 3
		{
			for(int j=0;j<4;j++) //Columns 3
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
				
		} */
		
		
		
		/*	
		 *  a[0][0] 1		[0][1] 2		[0][2] 3
		 * 
		 *  a[1][0]	4		[1][1] 5		[1][2] 6
		 *  
		 *  a[2][0]	7		[2][1] 8		[2][2] 9
		 *  
		 */
	}

}
