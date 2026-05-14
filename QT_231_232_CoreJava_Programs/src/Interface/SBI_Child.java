package Interface;

	interface  RBI_Parent  //interface Class 
	{
		public  void IntrestRate();  //Un-Implemented Method 
				
	}

	public class SBI_Child implements RBI_Parent //Normal Class 
	{
	public void IntrestRate()
	{
		System.out.println("SBI Intrest Rate:5%");
	}
	
	
}
