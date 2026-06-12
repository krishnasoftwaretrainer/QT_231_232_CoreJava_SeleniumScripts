package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffset_ClickAndHold_Release {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/dragabble");
		Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
		
		WebElement dragMe = driver.findElement(By.id("dragBox"));
		//actions.moveToElement(dragMe).moveByOffset(150, 0).build().perform(); //Left to Right
	
		actions.clickAndHold(dragMe).build().perform();
		Thread.sleep(2000);
		actions.moveByOffset(300, 0).build().perform(); //Left to Right
		Thread.sleep(2000);
		actions.moveByOffset(0, 150).build().perform(); //Up to Down
		Thread.sleep(2000);
		actions.moveByOffset(-300, 0).build().perform(); //Right to Left
		Thread.sleep(2000);
		actions.moveByOffset(0, -150).build().perform(); //Down to Up
		Thread.sleep(2000);
		actions.release().build().perform();
		
	
	
	}

}
