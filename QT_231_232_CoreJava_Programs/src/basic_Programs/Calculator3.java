package basic_Programs;

import methods.Calculator1;
import methods.Calculator2;

public class Calculator3 //+ - * / % 
{
	public static void main(String[] args) 
	{
		Calculator1 cal3=new Calculator1();
		cal3.Addition();			//Public 
		Calculator1.Subtraction();  //Private
		cal3.Multiplication(); 		//Protected
		Calculator1.Division(); 	//default 
		
		Calculator2 cal4=new Calculator2();
		cal4.Modulus();
		
	}
}
