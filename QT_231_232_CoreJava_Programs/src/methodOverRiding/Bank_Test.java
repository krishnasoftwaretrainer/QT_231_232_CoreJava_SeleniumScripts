package methodOverRiding;

public class Bank_Test {

	public static void main(String[] args) 
	{
		RBI_Parent rbi=new RBI_Parent();
		rbi.IntrestRate();
		System.out.println("======================");
		SBI_Child1 sbi=new SBI_Child1();
		sbi.IntrestRate();		
		System.out.println("======================");
		HDFC_Child2 hdfc=new HDFC_Child2();
		hdfc.IntrestRate();		
		System.out.println("======================");
		ICICI_Child3 icici=new ICICI_Child3();
		icici.IntrestRate();	}

}
