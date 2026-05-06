package strings;

public class String_Methods {

	public static void main(String[] args) {
		
		//1. length() method
		/*
		String name="Krishna Rao21#$ "; //7 
		System.out.println(name.length());
		
		//2. charAt() method next().charAt(0) 
		String name="Krishna";
		System.out.println(name.charAt(0)); //K
		System.out.println(name.charAt(1)); //r
		System.out.println(name.charAt(2)); //i
		
		
		//3. toUpperCase() coverts upper case to lower case and toLowerCase() method
		
		String name="abcdefgHIJK";
		System.out.println("Actual String: "+name);
		System.out.println("UpperCase: "+name.toUpperCase()); 
		
		String name1="ABCDEFGhijk";
		System.out.println("Actual String: "+name1);
		System.out.println("LowerCase: "+name1.toLowerCase());
		
		
		//4. trim() method 
		String name="  krishna rao  ";
		System.out.println("Actual String:"+name);
		System.out.println("Trimmed String:"+name.trim());
		
		//5. String concatenation
		String name="Krishna ";
		String surname="Rao";
		
		System.out.println(name.concat(surname)); //KrishnaRao
	    
				//6.String Replace() method
		
		String name="Krishna Rao";
		System.out.println("Actual String: "+name);
		//System.out.println("Replaced String: "+name.replace('a', 'A'));
		System.out.println("Replaced String: "+name.replace("Krishna", "Rama"));
		
		//7. Copy Value Method
		
		String S1="ABCDEFG";
		String S2="";
		
		System.out.println("Before Copying: "+S2);
		System.out.println("After Copying: "+S2.valueOf(S1));
		
		char ch[]={'A','B','C','D','E','F','G'};
		String ch1="";
		System.out.println("Before Copying: "+ch1);
		System.out.println("After Copying: "+ch1.copyValueOf(ch));
		
		
		String name="  ";
		System.out.println(name.isEmpty()); //false
		 */
		
		//String  Contains() method
		String url="https://www.saucedemo.com";
		System.out.println(url.contains("inventory")); 
	}
	
	
	

}
