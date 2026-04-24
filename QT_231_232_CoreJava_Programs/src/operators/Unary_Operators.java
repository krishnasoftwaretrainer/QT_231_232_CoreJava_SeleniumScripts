package operators;

public class Unary_Operators {

	public static void main(String[] args) {

		/*
		int a=10,b=10;
		
		System.out.println("a++: " + (a++)); //10
		System.out.println("a: " + (a)); //11
		
		System.out.println("b--: " + (b--)); //10
		System.out.println("b: " + (b)); //9
		*/
		
		int a=10,b=10,c=10,d=10;
		
		System.out.println("First a: " + a); //10
		System.out.println("++a: " + (++a)); //11
		System.out.println("Update a: " + a); //11
		System.out.println("================================");
		//b value
		
		System.out.println("First b: " + b); //10
		System.out.println("b++: " + (b++)); //10
		System.out.println("Update b: " + b); //11
		
		System.out.println("================================");
		
		System.out.println("First c: " + c); //10
		System.out.println("--c: " + (--c)); //9
		System.out.println("Print c: " + c); //9
		System.out.println("Update c: " + c); //9
		
		System.out.println("================================");
		
		System.out.println("First d: " + d); //10
		System.out.println("d--(print): " + (d--)); //Print:10
		System.out.println("Update d: " + d); //9
	}

}
