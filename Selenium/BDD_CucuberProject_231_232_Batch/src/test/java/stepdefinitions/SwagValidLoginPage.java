package stepdefinitions;

import io.cucumber.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagValidLoginPage 
{
	WebDriver driver;
	@Given("user should be on Swaglabs loginpage")
	public void user_should_be_on_swaglabs_loginpage() throws InterruptedException 
	{
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/");
		Thread.sleep(2000);
	}

	@When("user enter valid username {string}")
	public void user_enter_valid_username(String string) throws InterruptedException 
	{
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys(string);
		Thread.sleep(2000);
	
	}

	@And("user enter valid password {string}")
	public void user_enter_valid_password(String string) throws InterruptedException 
	{
	WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(string);
		Thread.sleep(2000);
	}

	@And("click on login button")
	public void click_on_login_button() throws InterruptedException 
	{
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();	
		Thread.sleep(2000);
	}

	@Then("user should see the products page")
	public void user_should_see_the_products_page() throws InterruptedException
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
	 driver.quit();
	 
	}



}
