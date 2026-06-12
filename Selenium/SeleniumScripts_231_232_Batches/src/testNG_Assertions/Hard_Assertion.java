package testNG_Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assertion 
{
	WebDriver driver;
	 
	@Test
	public  void SwagValidLogin() throws InterruptedException
	{   
		
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
		Thread.sleep(2000);
		//String ExceptedURL="https://www.saucedemo.com/invento.html";
		String ActuvalURL=driver.getCurrentUrl();
		System.out.println("ActuvalURL: "+ActuvalURL);
		//Hard Assertion
		//Assert.assertEquals(ActuvalURL.contains("inventory"),"Test Case Fail"); //Fail
		
		Assert.assertTrue(ActuvalURL.contains("inventory"),"Test Case Fail");
		
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Test Execution Completed");
		
	}
	

}
