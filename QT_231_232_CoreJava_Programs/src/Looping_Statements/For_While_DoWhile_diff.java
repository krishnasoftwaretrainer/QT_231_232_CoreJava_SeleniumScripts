package Looping_Statements;

public class For_While_DoWhile_diff {

	public static void main(String[] args)
	{
		//Exit Control Loop: Do-While Loop
		/*
		int i = 6;

		do 
		{
			System.out.println(i);
			i++; //7
		} while (i <5); //7<5:False exit
	*/
		//Entry Control Loop: For and While Loop
		/*
		for(int i=6;i<5;i++) //6<5:False exit
		{
			System.out.println(i);
		}  */
		
		int i=6;
		while(i<5) //6<5:False exit
		{
			System.out.println(i);
			i++;
		}
	}

	}


