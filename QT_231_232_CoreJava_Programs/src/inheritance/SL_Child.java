package inheritance;

public class SL_Child extends SL_Parent
{
	public void SL_Son()
	{
		System.out.println("I am your SL Child");
	}
	
	public static void main(String[] args) 
	{
		
		SL_Child ch=new SL_Child();
		ch.SL_Father();
		ch.SL_Son();
	}

}
