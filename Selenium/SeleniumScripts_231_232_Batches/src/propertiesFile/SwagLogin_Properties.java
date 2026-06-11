package propertiesFile;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
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
		Thread.sleep(2000);
	}
	
	@Test(priority=0)
	public void SwagValidLoginPageTest() throws InterruptedException, IOException 
	{
		fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace_232Batch\\SeleniumScripts_231_232_Batches\\src\\propertiesFile\\Swag_URL_Locaters.properties");
		prop.load(fis);
		//Thread.sleep(3000);
		
		WebElement usernameL=driver.findElement(By.id(prop.getProperty("UserName_Locater")));
		usernameL.sendKeys(prop.getProperty("ValidUserName"));
		Thread.sleep(2000);
		
		WebElement passwordL=driver.findElement(By.id(prop.getProperty("Password_Locater")));
		passwordL.sendKeys(prop.getProperty("ValidPassword"));
		Thread.sleep(3000);
		
		WebElement loginL=driver.findElement(By.xpath(prop.getProperty("LoginButton_Locater")));
		loginL.click();
		Thread.sleep(2000);
		WebElement InventoryPage = driver.findElement(By.id("inventory_container"));
		Assert.assertTrue(InventoryPage.isDisplayed(), "Inventory Page is not Displayed");
		Thread.sleep(2000);
		
		WebElement ThreeLines = driver.findElement(By.id("react-burger-menu-btn"));
		Assert.assertTrue(ThreeLines.isDisplayed(), "Three Lines not displayed");
		ThreeLines.click();
		Thread.sleep(2000);

		// Hard Assertion-6
		WebElement LogoutButton = driver.findElement(By.id("logout_sidebar_link"));
		Assert.assertNotNull(LogoutButton, "LogOut Buttion is Null");
		LogoutButton.click();
		Thread.sleep(2000);

		}

	@Test(priority=1)
	public void SwagInValidLoginPageTest() throws InterruptedException, IOException 
	{
		fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace_232Batch\\SeleniumScripts_231_232_Batches\\src\\propertiesFile\\Swag_URL_Locaters.properties");
		prop.load(fis);
		Thread.sleep(2000);
		
		WebElement usernameL=driver.findElement(By.id(prop.getProperty("UserName_Locater")));
		usernameL.sendKeys(prop.getProperty("InvalidUserName"));
		Thread.sleep(2000);
		
		WebElement passwordL=driver.findElement(By.id(prop.getProperty("Password_Locater")));
		passwordL.sendKeys(prop.getProperty("InvalidPassword"));
		Thread.sleep(3000);
		
		WebElement loginL=driver.findElement(By.xpath(prop.getProperty("LoginButton_Locater")));
		loginL.click();
		Thread.sleep(3000);
		
		WebElement ErrorMessageElement = driver.findElement(By.xpath("//h3[@data-test=\"error\"]"));
		String errorMeassge = ErrorMessageElement.getText();
		
		//Error message contains "Epic sadface"
		Assert.assertTrue(errorMeassge.contains("Epic sadface"), "Error Message is not correct or not displayed");
		
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

