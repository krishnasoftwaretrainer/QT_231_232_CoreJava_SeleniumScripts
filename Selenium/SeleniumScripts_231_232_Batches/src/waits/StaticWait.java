package waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWait 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		
		driver=new ChromeDriver();//Open
		Thread.sleep(5000);  //Static Wait 
		driver.manage().window().maximize(); //Maximize
		Thread.sleep(5000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		System.out.println("URL is opened successfully");
		Thread.sleep(5000);
		driver.close(); //Close /
		System.out.println("Success");
		
	}
}
