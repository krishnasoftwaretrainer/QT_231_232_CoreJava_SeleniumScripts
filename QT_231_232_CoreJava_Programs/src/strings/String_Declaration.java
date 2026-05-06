package strings;
import java.util.Scanner;
public class String_Declaration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//String email="krishn123@gmail.com";
		
		System.out.println("Enter your email id");
		//String email=sc.next();
		 String email=sc.nextLine();
		System.out.println(email);
		
		//Two ways to declare a string
		//1. Using String literal
		
		//String name="Krishna";  //Static 
		//System.out.println(name);
		//2.String new Keyword  
		
		//String name1=new String("Ramesh");
		//System.out.println(name1);
	}

}
