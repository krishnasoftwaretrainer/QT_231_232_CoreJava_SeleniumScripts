package operators;

public class Logical_Operators {

	public static void main(String[] args) {

  boolean a=true, b=false;
          a=false; b=true; //(false , true,true, false,true)
          a=false; b=false; //(false , false,true,true,true)
          a=true; b=true; //(true , true,false,false,false)
          
          
          System.out.println("a && b: " + (a && b)); //true && false: false
          System.out.println("a || b: " + (a || b)); //true || false: true
          System.out.println("!a: " + (!a)); // !true: false
          System.out.println("!b: " + (!b)); // !false: true
          System.out.println("!(a && b): " + (! (a && b))); // ! (true && false): !false: true
          
          
	}

}
