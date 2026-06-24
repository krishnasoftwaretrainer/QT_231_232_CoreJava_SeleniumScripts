package stepdefinitions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
public class SwagInValidLoginPage 
{
	WebDriver driver;
	@Given("user should Open Swaglabs loginpage")
	public void user_should_open_swaglabs_loginpage() throws InterruptedException 
	{
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/");
		Thread.sleep(2000);
	}

	@When("user enter invalid username {string}")
	public void user_enter_invalid_username(String string) throws InterruptedException
	{
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys(string);
		Thread.sleep(2000);
	
	}

	@When("user enter invalid password {string}")
	public void user_enter_invalid_password(String string) throws InterruptedException 
	{
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(string);
		Thread.sleep(2000);
	
	 	}

	@When("click on login button after display")
	public void click_on_login_button_after_display() throws InterruptedException 
	{
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();	
		Thread.sleep(2000);
	
	}

	@Then("user should see the error message {string}")
	public void user_should_see_the_error_message(String string) throws InterruptedException
	{
		WebElement error=driver.findElement(By.xpath("//h3[@data-test='error']"));
		Assert.assertEquals(error.getText(),string);
		Thread.sleep(2000);
		driver.quit();
		
	}



}
