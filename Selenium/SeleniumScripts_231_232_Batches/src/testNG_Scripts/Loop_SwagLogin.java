package testNG_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Loop_SwagLogin 
{
	public static void main(String[] args) throws InterruptedException
	{
		for(int i=1;i<=5;i++)
		{
			WebDriver driver;
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(2000);
			
			WebElement username=driver.findElement(By.id("user-name"));
			WebElement password=driver.findElement(By.id("password"));
			WebElement login=driver.findElement(By.id("login-button"));
			
			
			username.sendKeys("");
			Thread.sleep(2000);
			password.sendKeys("");
			Thread.sleep(2000);
			login.click();
			Thread.sleep(3000);
			driver.quit();
			Thread.sleep(2000);
			System.out.println(i+" Time Execution");
		
		}
		
	}

}
