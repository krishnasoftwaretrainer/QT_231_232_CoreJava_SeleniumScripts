package constructors;

public class With_Parameters_Constructors 
{
	
	private With_Parameters_Constructors(int htno,String name, double percentage)
	{
		System.out.println("HTNO: "+htno);
		System.out.println("Name: "+name);
		System.out.println("Percenatge: "+percentage);
				
	}

	public static void main(String[] args) {
		With_Parameters_Constructors obj=new With_Parameters_Constructors(123,"Krishna",99.99);
		With_Parameters_Constructors obj1=new With_Parameters_Constructors(222,"Ramesh",88.88);
		With_Parameters_Constructors obj2=new With_Parameters_Constructors(555,"vsdfs",77.77);
		
	}
}
