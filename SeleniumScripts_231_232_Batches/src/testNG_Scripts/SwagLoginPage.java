package testNG_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SwagLoginPage 
{
	 WebDriver driver;
	 
	@Test(priority=0,invocationCount=2)
	public  void SwagValidLogin() throws InterruptedException
	{   //WOR and WOP [Insatnec or Non-Static]
		
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		WebElement username=driver.findElement(By.id("user-name"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement login=driver.findElement(By.id("login-button"));
		
		
		username.sendKeys("standard_user");
		Thread.sleep(2000);
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		login.click();
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	@Test(priority=1,invocationCount=3)
	public void SwagInvalidLogin() throws InterruptedException
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		WebElement username=driver.findElement(By.id("user-name"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement login=driver.findElement(By.id("login-button"));
		
		
		username.sendKeys("cskfjsdkjf");
		Thread.sleep(2000);
		password.sendKeys("adnfadnnv");
		Thread.sleep(2000);
		login.click();
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	@Test(priority=2,invocationCount=4,enabled=false)
	public void SwagBlankLogin() throws InterruptedException
	{
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
		
	}
	
	

}
