package strings;

public class equals_equalIgnoreCase_DoubleEqual {

	public static void main(String[] args) {
		// = == equals() a=5
		
		String name="krishna";
		String name1="krishna";
		
		System.out.println(name==name1); //true 
		
		String name2=new String("krishna1");
		String name3=new String("krishnA");
		System.out.println(name2==name3); //false
		
		System.out.println(name==name2); //false
		
		System.out.println(name.equals(name1)); //true
		System.out.println(name2.equals(name3)); //true
		System.out.println(name2.equalsIgnoreCase(name3)); //true
		
	}

}
