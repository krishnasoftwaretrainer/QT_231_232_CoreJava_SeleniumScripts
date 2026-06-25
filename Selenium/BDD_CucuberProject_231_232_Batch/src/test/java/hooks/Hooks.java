package hooks;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.*;

public class Hooks 
{
	public static WebDriver driver;
	
	@Before
	public void BrowserSetup() throws InterruptedException
	{
		System.out.println("Before Hook - Browser Setup");
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/");
		Thread.sleep(2000);

	}
	
	@After
	public void BrowserTearDown() throws InterruptedException
	{
		System.out.println("After Hook - Browser Tear Down");
		Thread.sleep(2000);
		driver.quit();
	}

}
