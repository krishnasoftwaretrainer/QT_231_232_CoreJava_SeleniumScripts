package swagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs_LoginPage {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		String ExceptedURL="https://www.Saucedemo.com/";
		String ActuvalURL =driver.getCurrentUrl();
		
		if(ExceptedURL.equalsIgnoreCase(ActuvalURL))
		{
			
			//driver.findElement(By.id("user-name")).sendKeys("standard_user");
			
			WebElement UserName=driver.findElement(By.id("user-name"));
			UserName.sendKeys("standard_user");
			
			UserName.sendKeys("Krishna");
			
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("secret_sauce");
			Thread.sleep(2000);
			//driver.findElement(By.className("submit-button btn_action")).click();
			
			driver.findElement(By.id("login-button")).click();
			String Currenturl=driver.getCurrentUrl();
			if(Currenturl.contains("inventory"))
			{
				System.out.println("Test Case Pass");
			}
			else
			{
				System.out.println("Test Case Fail");
			}
			//Enter UserName
			//Enter Password 
			//Clcik on Login Button
			//Check the result 
		}
		else
		{
			System.out.println("Smoke Testing: Fail ");
			System.out.println("Unable to Continue");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
