package operators;

public class Assignment_Operators {

	public static void main(String[] args) {
		
		/*
		int a=10,b=10,c=10,d=10,e=10;
		System.out.println("a+=20: " + (a+=20)); //a=a+20;a=10+20;a=30 
		System.out.println("a-=20: " + (b-=20)); //b=b-20;b=10-20;b=-10
		System.out.println("a*=20: " + (c*=20)); //c=c*20;c=10*20;c=200
		System.out.println("a/=20: " + (d/=20)); //d=d/20;d=10/20;d=0
		System.out.println("a%=20: " + (e%=20)); //e=e%20;e=10%20;e=10
		*/
		
		int x=10;  //Normal Variable
		System.out.println("x+=20: " + (x+=20)); //x=x+20;x=10+20;x=30;
		System.out.println("x-=20: " + (x-=20)); //x=x-10;x=30-20;x=+10; 
		System.out.println("x*=20: " + (x*=20)); //x=x*20;x=10*20;x=200;
		System.out.println("x/=20: " + (x/=20)); //x=x/20;x=200/20;x=10;
		System.out.println("x%=20: " + (x%=20)); //x=x%20;x=10%20;x=10;
	}

}
