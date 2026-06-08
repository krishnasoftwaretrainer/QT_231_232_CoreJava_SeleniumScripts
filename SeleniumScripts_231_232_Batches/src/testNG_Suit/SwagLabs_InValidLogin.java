package testNG_Suit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SwagLabs_InValidLogin 
{
	WebDriver driver;
	@Test
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
	

}
