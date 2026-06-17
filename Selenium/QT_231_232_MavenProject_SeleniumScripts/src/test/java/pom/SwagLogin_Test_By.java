package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SwagLogin_Test_By 
{
		WebDriver driver;
		POM_By_SwagLabsLogin login;
		
		@BeforeMethod
		public void BrowserSetup() throws InterruptedException
		{
			driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(2000);
			login = new POM_By_SwagLabsLogin(driver);
		}
		
		@Test(priority=0)  //Valid Valid Login Test
		public void SwagValidLoginTest() throws InterruptedException
		{
			login.loginToSwagLabs("standard_user","secret_sauce");
			Thread.sleep(2000);
			
			String actualProductsTitle = login.getProductsText();
			
			Assert.assertEquals(actualProductsTitle, "Products", "Login Failed: Products title mismatch");
			
			System.out.println("Products Title: " + actualProductsTitle);
		}
		
		//Invalid Login Test
		
		@Test(priority=1)
		public void SwagInValidLoginTest() throws InterruptedException
		{
			login.loginToSwagLabs("invalidUsername","invalidpassword");
			Thread.sleep(2000);
			
			String actualErrorMessageText = login.getErrorMessageText();
			Thread.sleep(2000);
			
			String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
			
			Assert.assertEquals(actualErrorMessageText, expectedErrorMessage, "Login Failed: Error message mismatch");
			
			//Assert.assertTrue(actualErrorMessageText.contains("Epic sadface: Username and password do not match any user in this service"), "Login Failed: Error message mismatch");
		
			System.out.println("Error Message: " + actualErrorMessageText);
		}
		
		@Test(priority=2)
		public void SwagBlankLoginTest() throws InterruptedException
		{
			login.loginToSwagLabs("","");
			Thread.sleep(2000);
			
			String actualErrorMessageText = login.getErrorMessageText();
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
