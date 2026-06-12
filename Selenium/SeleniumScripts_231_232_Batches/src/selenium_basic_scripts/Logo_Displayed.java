package selenium_basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Logo_Displayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		Thread.sleep(2000);
		
		WebElement logo = driver.findElement(By.xpath("//img[@src=\"/assets/Toolsqa-DZdwt2ul.jpg\"]"));
		//WebElement logo = driver.findElement(By.xpath("//a[@href=\"https://demoqa.com\"]"));
		if(logo.isDisplayed()) 
		{
			System.out.println("Logo is displayed");
		}
		else
		{
			System.out.println("Logo is not displayed");
		}
		Thread.sleep(2000);
		 driver.quit();
	}

}
