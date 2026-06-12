package testNG_Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sof_Assertion 
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
			//Soft Assertion
			SoftAssert soft = new SoftAssert();
			//soft.assertEquals(ExceptedURL, ActuvalURL,"URL not Matching");  //Fail
			
			soft.assertTrue(ActuvalURL.contains("Krishna"),"Test Case Fail");
			Thread.sleep(2000);
			driver.quit();
			Thread.sleep(2000);
			System.out.println("Execution Completed");
			soft.assertAll();
			
		}
		


}
