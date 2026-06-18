package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();//Open
		driver.manage().window().maximize(); //Maximize
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
		
		driver.get("https://www.saucedemo.com/");
		
		//Explicit  Wait:Local Wait
		WebElement usernameL=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
		usernameL.sendKeys("problem_user");
		
		WebElement passwordL=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		passwordL.sendKeys("secret_sauce");
		
		WebElement loginL=wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
		loginL.click();
		
		WebElement ThreeLines=wait.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn")));
		ThreeLines.click();
		
		WebElement LogOut=wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
		LogOut.click();
		
		System.out.println("Success");
		
	}

}
