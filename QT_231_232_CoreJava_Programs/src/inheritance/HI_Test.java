package inheritance;

public class HI_Test 
{
	public static void main(String[] args) 
	{
		HI_Child1 ch1=new HI_Child1();
		ch1.Father();
		ch1.Child1();
		System.out.println("=======================");
		
		HI_Child2 ch2=new HI_Child2();
		ch2.Father();
		ch2.Child2();
		System.out.println("==================");
		
		HI_Child3 ch3=new HI_Child3();
		ch3.Father();
		ch3.Child3();
		
	}

}
