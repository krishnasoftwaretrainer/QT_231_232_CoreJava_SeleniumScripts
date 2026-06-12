package testNG_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {

	WebDriver driver;

	//@BeforeMethod   // 9am 4 Primary 12:30  High 9am 10am 11am 12am  
	//@BeforeClass
	@BeforeTest
	public void BrowserOpen() throws InterruptedException {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

	}

	@Test(priority=1)  //Test Case-1
	public void SwagValidLogin() throws InterruptedException { // WOR and WOP [Insatnec or Non-Static]

		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login-button"));
		
		username.sendKeys("standard_user");
		Thread.sleep(2000);
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		login.click();
		Thread.sleep(3000);
		WebElement threeLines=driver.findElement(By.id("react-burger-menu-btn"));
		threeLines.click();
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.id("logout_sidebar_link"));
		logout.click();
		Thread.sleep(2000);
		
	}

	@Test(priority=2) //Test Case-2
	public void SwagInValidLogin() throws InterruptedException { // WOR and WOP [Insatnec or Non-Static]

		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login-button"));

		username.sendKeys("gdfgdfg");
		Thread.sleep(2000);
		password.sendKeys("sdgdsgs");
		Thread.sleep(2000);
		login.click();
		Thread.sleep(3000);

	}
	
	@Test(priority=3) //Test Case-2
	public void SwagBlankLogin() throws InterruptedException { // WOR and WOP [Insatnec or Non-Static]

		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login-button"));

		username.clear();
		Thread.sleep(2000);
		username.sendKeys("");
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		password.sendKeys("");
		Thread.sleep(2000);
		login.click();
		Thread.sleep(3000);
		
	}

	//@AfterMethod
	//@AfterClass
	@AfterTest
	public void BrowserClose() {
		if (driver != null) {
			driver.quit();
		}
	}

}
