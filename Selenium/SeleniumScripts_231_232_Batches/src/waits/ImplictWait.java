package waits;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ImplictWait {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();//Open
		driver.manage().window().maximize(); //Maximize
		driver.get("https://www.saucedemo.com/");
		
		//Implicit Wait:Global Wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement usernameL=driver.findElement(By.id("user-name"));
		usernameL.sendKeys("problem_user");
		
		WebElement passwordL=driver.findElement(By.id("password"));
		passwordL.sendKeys("secret_sauce");
		
		WebElement loginL=driver.findElement(By.id("login-button"));
		loginL.click();
		
		WebElement ThreeLines=driver.findElement(By.id("react-burger-menu-btn"));
		ThreeLines.click();
		
		WebElement LogOut=driver.findElement(By.id("logout_sidebar_link"));
		LogOut.click();
		
		System.out.println("Success");
		
		
		
	}

}
