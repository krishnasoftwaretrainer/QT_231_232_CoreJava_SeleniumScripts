package selenium_basic_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class URL_Verification {

	public static void main(String[] args) throws InterruptedException 
	{
		//WebDriver driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		//driver.get("https://www.selenium.dev/downloads/");
		
		Thread.sleep(2000);
		String ExceptedURL="https://www.Saucedemo.com/";
		String ActuvalURL =driver.getCurrentUrl();
		
		System.out.println("ExceptedURL: "+ExceptedURL);
		System.out.println("ActuvalURL: "+ActuvalURL);
		
		//if(ActuvalURL.equals(ExceptedURL))
		//if(ActuvalURL.equalsIgnoreCase(ExceptedURL))
		if(ActuvalURL.contains("saucedemo"))
		{
			System.out.println("Smoke Testing: Pass");
		}
		else
		{
			System.out.println("Smoke Testing: Fail ");
		}
		Thread.sleep(2000);
		driver.close();
		
		
		
		/*
		 * 	1.Open Browser
			2.Maximize the Browser
			3.Enter App URL[Given by Dev Team]
			4.Close Browser
			
			Compare Actuval URL with Excepted URL
			Both are Same:Pass
			Both are not Same:Fail
		 */
	}

}
