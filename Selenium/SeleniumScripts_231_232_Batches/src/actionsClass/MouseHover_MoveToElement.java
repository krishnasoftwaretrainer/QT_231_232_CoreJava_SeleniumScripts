package actionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseHover_MoveToElement 
{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.browserstack.com/");
		Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
		
		WebElement products=driver.findElement(By.id("products-dd-toggle"));
		
		actions.moveToElement(products).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=\"Live\"]")).click();
		Thread.sleep(2000);
		
		if(driver.getCurrentUrl().contains("live"))
		{
			WebElement Features=driver.findElement(By.id("menu-item-82381"));
			actions.moveToElement(Features).build().perform();
			Thread.sleep(2000);
			
			WebElement LocalTesting=driver.findElement(By.xpath("//span[text()=\"Local Testing\"]"));
			actions.moveToElement(LocalTesting).build().perform();
			Thread.sleep(2000);
			
			WebElement VSCodeIntegration=driver.findElement(By.id("menu-item-82550"));
			VSCodeIntegration.click();
		}
		
	}

}
