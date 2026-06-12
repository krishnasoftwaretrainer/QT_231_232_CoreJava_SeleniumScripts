package testNG_Assertions;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Equal_NotEquls {
	WebDriver driver;

	@Test(priority = 0)
	public void SwagValidLogin() throws InterruptedException {
		SoftAssert soft = new SoftAssert();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.facebook.com/");
		driver.get("https://www.saucedemo.com/");
		String ExceptedURL = "https://www.saucedemo.com/";
		Thread.sleep(2000);
		String CurrentURL = driver.getCurrentUrl(); // Actual
		Thread.sleep(2000);

		// Hard Assertion:Pass
		// Assert.assertEquals(ExceptedURL, CurrentURL,"SwagLabs Login Page is not
		// Opened");

		// Soft Assertion-1
		soft.assertEquals(ExceptedURL, CurrentURL, "SwagLabs Login Page is not Opened");

		Thread.sleep(2000);

		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login-button"));

		username.sendKeys("standard_user");
		Thread.sleep(2000);
		String EnteredUserName = username.getAttribute("value");

		// Hard Assertion-1 Pass/Fail
		Assert.assertEquals(EnteredUserName, "standard_user", "Wrong Username");
		// Assert.assertNotEquals(EnteredUserName, "standard_user","Wrong Username");

		// soft.assertEquals(EnteredUserName, "standard_user","Wrong Username");

		password.sendKeys("secret_sauce");
		// password.sendKeys(null);
		Thread.sleep(2000);
		String EnteredPassword = password.getAttribute("value");
		String ExceptedPassword = "secret_sauce";
		Thread.sleep(2000);

		Assert.assertNotNull(EnteredPassword, "Not entered password");
		// Assert.assertNull(EnteredPassword,"Not entered password");

		// Hard Assertion-2 Pass/Fail
		Assert.assertEquals(EnteredPassword, ExceptedPassword, "Wrong Password");

		// Hard Assertion-3 Pass/Fail
		Assert.assertTrue(login.isDisplayed() && login.isEnabled(), "Problem with Login Buttion");
		// Assert.assertFalse(login.isDisplayed() && login.isEnabled(),"Problem with
		// Login Buttion");

		Thread.sleep(2000);
		login.click();
		Thread.sleep(2000);

		if (driver.getCurrentUrl().contains("inventory")) {
			// Hard Assertion-4
			WebElement InventoryPage = driver.findElement(By.id("inventory_container"));
			Assert.assertNotNull(InventoryPage, "Inventory Page is not displayed");
			Thread.sleep(2000);

			// Hard Assertion-5
			WebElement ThreeLines = driver.findElement(By.id("react-burger-menu-btn"));
			Assert.assertTrue(ThreeLines.isDisplayed(), "Three Lines not displayed");
			ThreeLines.click();
			Thread.sleep(2000);

			// Hard Assertion-6
			WebElement LogoutButton = driver.findElement(By.id("logout_sidebar_link"));
			Assert.assertNotNull(LogoutButton, "LogOut Buttion is Null");
			LogoutButton.click();
			Thread.sleep(2000);

		} else {
			WebElement ErrorMessageElement = driver.findElement(By.xpath("//h3[@data-test=\"error\"]"));
			String errorMeassge = ErrorMessageElement.getText();
			System.out.println(errorMeassge);
		}
		soft.assertAll();  //Prints all fail TC results.
		
		Thread.sleep(3000);
		driver.quit();

	}

}
