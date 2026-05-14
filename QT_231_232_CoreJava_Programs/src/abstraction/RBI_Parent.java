package abstraction;

public  abstract class  RBI_Parent //abstract class or Normal or non-abstract class 
{
	public abstract void IntrestRate();  //abstract method 
	
	
	//No-Implemantion[Secured]:50%
	// 0 to 100% 
	
	public void BankName()  //Normal Method
	{
		System.out.println("Bank Name:RBI");
		//Implemented Method:[No Secured]:50% 
	}
}
