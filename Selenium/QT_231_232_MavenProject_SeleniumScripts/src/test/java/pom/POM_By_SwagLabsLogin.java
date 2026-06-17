package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_By_SwagLabsLogin 
{
WebDriver driver;
	
	public POM_By_SwagLabsLogin(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	//Locators by using POM By class
	By SwagLabs_UsernameL = By.id("user-name");
	By SwagLabs_PasswordL = By.id("password");
	By SwagLabs_LoginButtonL = By.xpath("//input[@value=\"Login\"]");
	By SwagLabs_ProductsL = By.xpath("//span[text()='Products']");
	By SwagLabs_ErrorMessageL = By.xpath("//h3[@data-test=\"error\"]");
	
	//Methods->Actions
	
	public void enterUsername(String username) 
	{
		driver.findElement(SwagLabs_UsernameL).sendKeys(username);
	}
	
	public void enterPassword(String password) 
	{
		driver.findElement(SwagLabs_PasswordL).sendKeys(password);
	}
	
	public void clickLoginButton() 
	{
		driver.findElement(SwagLabs_LoginButtonL).click();
	}
	
	public String getProductsText() 
	{
		return driver.findElement(SwagLabs_ProductsL).getText();
	}
	
	public String getErrorMessageText() 
	{
		return driver.findElement(SwagLabs_ErrorMessageL).getText();
	}
	
	//ReUsable method to perform login
	
	public void loginToSwagLabs(String username, String password) throws InterruptedException 
	{
		enterUsername(username);
		Thread.sleep(2000);
		enterPassword(password);
		Thread.sleep(2000);
		clickLoginButton();
		Thread.sleep(2000);
	}


}
