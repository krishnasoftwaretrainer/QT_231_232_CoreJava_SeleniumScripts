package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_RightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/buttons");
		Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
		
		//Click on Double Click Me button
		WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
		//doubleClickBtn.click();
		actions.doubleClick(doubleClickBtn).build().perform();
		Thread.sleep(2000);
		
		WebElement doubleClickMsg = driver.findElement(By.id("doubleClickMessage"));
		if(doubleClickMsg.isDisplayed()) 
		{
			System.out.println(doubleClickMsg.getText());
		}
		Thread.sleep(2000);
		
		//Click on Right Click Me button
		WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
		actions.contextClick(rightClickBtn).build().perform();
		Thread.sleep(2000);
		
		WebElement rightClickMsg = driver.findElement(By.id("rightClickMessage"));
		if(rightClickMsg.isDisplayed()) 
		{
			System.out.println(rightClickMsg.getText());
		}
		
		
	}

}
