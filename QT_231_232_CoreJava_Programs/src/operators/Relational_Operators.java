package operators;

public class Relational_Operators
{

	public static void main(String[] args)
	{
		int a=10,b=20;
		
		System.out.println("a < b: " + (a < b)); //10 < 20: true
		System.out.println("a <= b: " + (a <= b));//10 < 20 OR 10 == 20: true
		
		System.out.println("a > b: " + (a > b)); //10 > 20: false
		System.out.println("a >= b: " + (a >= b)); //10 > 20 OR 10 == 20: false
		
		System.out.println("a == b: " + (a == b)); //10 == 20: false
		System.out.println("a != b: " + (a != b)); //10 != 20: true
		
		
	}

}
