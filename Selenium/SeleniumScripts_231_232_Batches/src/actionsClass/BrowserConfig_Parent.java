package actionsClass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public abstract class BrowserConfig_Parent 
{
	WebDriver driver;  //Global variable declaration[Instance]
	
	public void BrowserConfig() //Implemented
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/droppable");
		//Thread.sleep(3000);
		
	}
	public abstract void DragDrop() throws InterruptedException;  //Un-Implemented
	/*
	public void DragDrop() throws InterruptedException
	{
		System.out.println("This is Drag and Drop method");
	} */

}
