package java_Tokens;

public class Types_Conversition 
{

	public static void main(String[] args) 
	{
		//Implicit Type Conversion (Widening) Automatic conversion from smaller to larger data type
		// byte -> short -> char -> int -> long -> float -> double
		
		//byte a = 100; // byte value
		//short b = a; // byte to short
		
		//int c = 100; // int value
		//float d = c; // int to float
		//System.out.println("Int value: " + c);  //100
		//System.out.println("Float value: " + d); //
		
		//System.out.println("Byte value: " + a);
		//System.out.println("Short value: " + b);
		
		//char ch = '2'; // char value
		//int num = ch; // char to int (ASCII value)
		//float num = ch; // char to float (ASCII value)
		//System.out.println("Char value: " + ch); // A
		//System.out.println("Int/float value (ASCII): " + num); // 65
		
		//Explicit Type Conversion (Narrowing) Manual conversion from larger to smaller data type
		//
		//float f=99.99f;
		//int i=(int)f;  //99.99 -> 99
		//System.out.println("Float value: " + f); // 99.99
		//System.out.println("Int value: " + i); // 99
		
		//double d=61.45;
		int d=57;
		char ch=(char)d; 
		
		System.out.println("Double value: " + d); // 95.45
		System.out.println("Char value: " + ch); // _ (ASCII 95)
		
		
	}

}
