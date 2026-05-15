package exception_Handling;

public class GarbageColletion
{
	int a;
	double b;
	boolean c;
	String d;
	
	public static void main(String[] args) 
	{
		GarbageColletion garbage1=new GarbageColletion();
		GarbageColletion garbage2=new GarbageColletion();
		//Here garbage2 is Dead Object 
		
		System.out.println(garbage1.a);
		System.out.println(garbage1.b);
		System.out.println(garbage1.c);
		System.out.println(garbage1.d);
		
		
		int e; //Dead Variable 
		System.out.println(e);
		
}
	
	

}
