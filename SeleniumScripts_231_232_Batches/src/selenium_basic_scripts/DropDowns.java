package selenium_basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns 
{

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Register.html");
	Thread.sleep(2000);
	
	//Scrolling the page down
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)"); //scroll down
	Thread.sleep(2000);
	
	//DropDown:Select Class
	WebElement Skills=driver.findElement(By.id("Skills"));
	Select select=new Select(Skills);
	//select.selectByIndex(5); //Select by Index
	//select.selectByValue("Engineering"); //Select by Value
	select.selectByVisibleText("Software"); //Select by Visible Text
	
	}

}
