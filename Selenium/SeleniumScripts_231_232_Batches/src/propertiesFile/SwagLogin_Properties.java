package propertiesFile;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLogin_Properties 
{
	WebDriver driver;

	Properties prop=new Properties();
	FileInputStream fis;
	
	@BeforeMethod
	public void BrowserSetup() throws InterruptedException, IOException
	{
		fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace_232Batch\\SeleniumScripts_231_232_Batches\\src\\propertiesFile\\Swag_URL_Locaters.properties");
		prop.load(fis);
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("SwagURL"));
		Thread.sleep(3000);
	}
	
	@Test
	public void SwagLoginPageTest() throws InterruptedException, IOException 
	{
		fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace_232Batch\\SeleniumScripts_231_232_Batches\\src\\propertiesFile\\Swag_URL_Locaters.properties");
		prop.load(fis);
		Thread.sleep(3000);
		
		WebElement usernameL=driver.findElement(By.id(prop.getProperty("UserName_Locater")));
		usernameL.sendKeys("standard_user");
		Thread.sleep(2000);
		
		WebElement passwordL=driver.findElement(By.id(prop.getProperty("Password_Locater")));
		passwordL.sendKeys("secret_sauce");
		Thread.sleep(3000);
		
		WebElement loginL=driver.findElement(By.xpath(prop.getProperty("LoginButton_Locater")));
		loginL.click();
		Thread.sleep(3000);
		
		}
	
	@AfterMethod
	public void BrowserTearDown()
	{
		if(driver!=null)
		{
			driver.quit();
		}

	}
	}

