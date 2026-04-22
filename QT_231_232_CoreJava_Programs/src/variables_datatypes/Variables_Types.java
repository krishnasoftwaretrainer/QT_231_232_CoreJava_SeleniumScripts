package variables_datatypes;

public class Variables_Types 
{

	// Global Variables
	static int num2 = 20; // Static Variable
	int num3 = 30; // Non-Static or Instance Variable, called through object reference variable

	public static void main(String[] args) {
		Variables_Types vb = new Variables_Types();

		//Local Variable
		int num1 = 10; // Use directly in main method[num1 is Normal Variable]
		num1 = 20; // Re-assigning value to local variable
		//num1 = 30;
		System.out.println("Local Variable: " + num1);

		// Static Variable call through class name
		System.out.println("Static Variable: " + Variables_Types.num2);

		System.out.println("Instance Variable: " + vb.num3);

		// Final Variable
		final int passingMarks = 35; //Constant Variable, value cannot be changed once assigned
		// passingMarks=30;

		System.out.println("Passing Marks: " + passingMarks);

	}

}
