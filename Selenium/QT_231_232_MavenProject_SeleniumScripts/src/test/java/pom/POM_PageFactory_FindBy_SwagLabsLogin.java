package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_PageFactory_FindBy_SwagLabsLogin 
{
	WebDriver driver;
	
  public POM_PageFactory_FindBy_SwagLabsLogin(WebDriver driver) 
  {
	this.driver = driver;
	
	PageFactory.initElements(driver, this);  //Initialize the WebElements using PageFactory
  }
  
  //Locators by using POM PageFactory FindBy class
  
  @FindBy(id="user-name")
  WebElement SwagLabs_UsernameL;
  
  @FindBy(id="password")
  WebElement SwagLabs_PasswordL;

  @FindBy(xpath="//input[@value=\"Login\"]")
  WebElement SwagLabs_LoginButtonL;
  
  @FindBy(xpath="//span[text()='Products']")
  WebElement SwagLabs_ProductsL;
  
  @FindBy(xpath="//h3[@data-test=\"error\"]")
  WebElement SwagLabs_ErrorMessageL;
  
//Methods->Actions
	
	public void enterUsername(String username) 
	{
		SwagLabs_UsernameL.sendKeys(username);
	}
	
	public void enterPassword(String password) 
	{
		SwagLabs_PasswordL.sendKeys(password);
	}
	
	public void clickLoginButton() 
	{
		SwagLabs_LoginButtonL.click();
	}
	
	public String getProductsText() 
	{
		return SwagLabs_ProductsL.getText();
	}
	
	public String getErrorMessageText() 
	{
		return SwagLabs_ErrorMessageL.getText();
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
