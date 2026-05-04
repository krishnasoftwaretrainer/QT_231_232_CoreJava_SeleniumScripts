package jumping_Statements;

public class Break_Continue {

	public static void main(String[] args) {
		
		/*
		
		for(int i=1;i<=10;i++)  //1<=10T 2<=10T..5<=10T 6<=10T
		{
			if(i==5)  //1==5F 2==5F 3==5F..5==5T..6==5F 7==5F..10==5F
			{
				//break; //Stops the execution immediately
				continue;
			}
			System.out.println(i);  //1 2 3 4 6 7 8 9 10
		}*/
		
		for(int i=1;i<=10;i++)  //1<=10T 2<=10T..5<=10T 6<=10T
		{
			if(i>=5 && i<=8) //5 6 7 8 
			{
				//break; 
				continue;
			}
			
			System.out.println(i);  //1 2 3 4 9 10
		
	}

}
}
