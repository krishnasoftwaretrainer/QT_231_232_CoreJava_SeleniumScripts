package Encapsulation_bank;

public class Customer 
{
	private int accnum=12345;
	private String accname="Krishna";
	private double balance=10000.00;
	
	public long getAccnum()
	{
		return accnum;
	}
	
	public void setAccnum(int accnum)
	{
		this.accnum=accnum;
	}
	
	public String getacname()
	{
		return accname;
	}
	
	public void setacname(String name)
	{
		this.accname=name;
				
	}
	
	public double getbalance()
	{
		return balance;
	}
	
	public void setbalanace(double balance)
	{
		this.balance=balance;
	}
	
	
	
	
	
	/*
	public static void main(String[] args) 
	{
		Customer cus=new Customer();
		System.out.println(cus.accnum);
		System.out.println(cus.accname);
		System.out.println(cus.balance);
		
	} */

}
