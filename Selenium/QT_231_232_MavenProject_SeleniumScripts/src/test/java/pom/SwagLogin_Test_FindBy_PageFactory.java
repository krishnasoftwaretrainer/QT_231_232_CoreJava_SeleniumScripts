package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SwagLogin_Test_FindBy_PageFactory 
{
	WebDriver driver;
	POM_PageFactory_FindBy_SwagLabsLogin FindBylogin;
	SoftAssert soft = new SoftAssert();
	
	@BeforeMethod
	public void BrowserSetup() throws InterruptedException
	{
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		FindBylogin = new POM_PageFactory_FindBy_SwagLabsLogin(driver);
	}
	
	@Test(priority=0)  //Valid Valid Login Test
	public void SwagValidLoginTest() throws InterruptedException
	{
		FindBylogin.loginToSwagLabs("standard_user","secret_sauce");
		Thread.sleep(2000);
		
		String actualProductsTitle = FindBylogin.getProductsText();
		
		Assert.assertEquals(actualProductsTitle, "Products", "Login Failed: Products title mismatch");
		
		System.out.println("Products Title: " + actualProductsTitle);
	}
	
	//Invalid Login Test
	
	@Test(priority=1)
	public void SwagInValidLoginTest() throws InterruptedException
	{
		FindBylogin.loginToSwagLabs("invaliduser","invalidpwd");
		Thread.sleep(2000);
		
		String actualErrorMessageText = FindBylogin.getErrorMessageText();
		Thread.sleep(2000);
		
		String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
		
		//Assert.assertEquals(actualErrorMessageText, expectedErrorMessage, "Login Failed: Error message mismatch");
		soft.assertEquals(actualErrorMessageText, expectedErrorMessage, "Login Failed: Error message mismatch");
		
		//Assert.assertTrue(actualErrorMessageText.contains("Epic sadface: Username and password do not match any user in this service"), "Login Failed: Error message mismatch");
	
		System.out.println("Error Message: " + actualErrorMessageText);
		soft.assertAll();
	}
	
	@Test(priority=2)
	public void SwagBlankLoginTest() throws InterruptedException
	{
		FindBylogin.loginToSwagLabs("","");
		Thread.sleep(2000);
		
		String actualErrorMessageText = FindBylogin.getErrorMessageText();
		Thread.sleep(2000);
		Assert.assertTrue(actualErrorMessageText.contains("Epic sadface: Username is required"), "Login Failed: Error message mismatch");
	
		System.out.println("Error Message: " + actualErrorMessageText);
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
