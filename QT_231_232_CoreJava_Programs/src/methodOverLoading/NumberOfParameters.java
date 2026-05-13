package methodOverLoading;

public class NumberOfParameters 
{
	public void Parameters()  //Zero 
	{
		System.out.println("No Parameters");
	}
	
	public void Parameters(String name) //One
	{
		System.out.println("One Parameter");
		System.out.println("Name:"+name);
	}
	
	public void Parameters(int htno,int marks) //Two
	{
		
		System.out.println("Two Parameter");
		System.out.println("HTNO:"+htno);
		System.out.println("Marks:"+marks);
		
	}
	
	public void Parameters(int a,int b,int c) //Three
	{
		System.out.println("Three Parameter");
		int sum=a+b+c;
		System.out.println("Addition:"+sum);
		
	}
	
	public static void main(String[] args) 
	{
		
		NumberOfParameters np=new NumberOfParameters();
		np.Parameters();
		np.Parameters("Krishna");
		np.Parameters(101, 95);
		np.Parameters(10, 20, 30);
		
	}
	

}
