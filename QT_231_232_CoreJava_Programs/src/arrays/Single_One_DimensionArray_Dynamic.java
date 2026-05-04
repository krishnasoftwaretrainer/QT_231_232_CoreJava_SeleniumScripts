package arrays;
import java.util.Scanner;

public class Single_One_DimensionArray_Dynamic {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		//Allocate the memory[size] to the array
		//Syntax: data type[] arrayName = new data type[size];
		
		int htno[]=new int[5];		
		
		System.out.println("Enter the arary Values");
		//Read the array values.
		
		for(int i=0;i<5;i++)
		{
			htno[i]=sc.nextInt();
		}
		
		System.out.println("The Array Values are");
		
		//Print the array values.
		for(int i=0;i<5;i++)
		{
			System.out.println(htno[i]);
		}
		
		
		//Array Index Out of Bound Exception
		
	}

}
