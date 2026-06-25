package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class SwagLogin_AllTestData_ScenarioOutLine 
{
	WebDriver driver;
	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() throws InterruptedException 
	{
		
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/");
		Thread.sleep(2000);
	}

	@When("The user enters a username {string}")
	public void the_user_enters_a_username(String string) throws InterruptedException 
	{
		
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys(string);
		Thread.sleep(2000);
	
	}

	@And("The user enters a password {string}")
	public void the_user_enters_a_password(String string) throws InterruptedException 
	{
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(string);
		Thread.sleep(2000);
	}

	@And("The user clicks the login button")
	public void the_user_clicks_the_login_button() throws InterruptedException 
	{
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();	
		Thread.sleep(2000);
		
	}

	@Then("The user should see the result")
	public void the_user_should_see_the_result() throws InterruptedException
	{
	 String currentUrl=driver.getCurrentUrl();
	 
	 if(currentUrl.contains("inventory"))
	 {
		 WebElement product=driver.findElement(By.xpath("//span[text()='Products']"));
		 product.isDisplayed();
		 Assert.assertEquals(product.getText(),"Products");
		 Thread.sleep(2000);
		 
		 WebElement Threelines=driver.findElement(By.id("react-burger-menu-btn"));
		 Threelines.click();
		 Thread.sleep(2000);
		 WebElement logout=driver.findElement(By.id("logout_sidebar_link"));
		 logout.click();
		 Thread.sleep(2000);
		 }
	 else
	 {
		 WebElement error=driver.findElement(By.xpath("//h3[@data-test='error']"));
		 Assert.assertTrue(error.getText().contains("Epic sadface:"));
		Thread.sleep(2000);
			
	 }
	 
	 driver.quit(); 
		
	}


}
