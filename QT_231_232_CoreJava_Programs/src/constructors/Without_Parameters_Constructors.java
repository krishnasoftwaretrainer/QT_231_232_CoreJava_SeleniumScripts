package constructors;

public class Without_Parameters_Constructors 
{
	public Without_Parameters_Constructors()
	{
		int htno=123;
		String name="Krishna";
		double percentage=99.99;
		boolean result=true;
		
		System.out.println("HTNO: "+htno);
		System.out.println("Name: "+name);
		System.out.println("Percenatge: "+percentage);
		System.out.println("Result: "+result);
	}
	
	public static void main(String[] args) {
		Without_Parameters_Constructors obj=new Without_Parameters_Constructors();
	}
	

}
