package Encapsulation_bank;

public class Employee 
{
	public static void main(String[] args) 
	{
		
		Customer cus=new Customer();
		cus.setacname("Ramesh");
		cus.setAccnum(55555);
		cus.setbalanace(20000.00);
		System.out.println(cus.getacname());
		System.out.println(cus.getAccnum());
		System.out.println(cus.getbalance());
		
		int a;  //Dead Object 
		int b;
	}

}
