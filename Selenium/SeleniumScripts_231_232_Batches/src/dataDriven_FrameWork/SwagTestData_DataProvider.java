package dataDriven_FrameWork;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;


public class SwagTestData_DataProvider 
{
	WebDriver driver;
	
	@DataProvider(name="SwagLoginAllTestData")
	public Object[][] SwagLoginTestData()
	{
		return new Object[][]   //7 sets of test data
				{
					{"standard_user","secret_sauce"},
					{"invalid_user","invalid_password"},
					{"invalid_user","secret_sauce"},
					{"standard_user","invalid_password"},
					{"standard_user",""},
					{"","secret_sauce"},
					{"",""}
				};
	}
	
	@BeforeMethod
	public void BrowserSetup() throws InterruptedException
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}
	
	@Test(dataProvider="SwagLoginAllTestData")
	public void SwagLoginPageTest(String username,String password) throws InterruptedException 
	{
		
		WebElement usernameL=driver.findElement(By.id("user-name"));
		WebElement passwordL=driver.findElement(By.id("password"));
		WebElement loginL=driver.findElement(By.id("login-button"));
		
		usernameL.sendKeys(username);
		Thread.sleep(2000);
		passwordL.sendKeys(password);
		Thread.sleep(2000);
		loginL.click();
		Thread.sleep(2000);
		
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
