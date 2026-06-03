package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/droppable");
		Thread.sleep(3000);
		
		Actions actions = new Actions(driver);
		
		WebElement dragMe = driver.findElement(By.id("draggable"));
		WebElement dropHere = driver.findElement(By.id("droppable"));
		
		actions.dragAndDrop(dragMe, dropHere).perform();
		Thread.sleep(2000);
		 driver.quit();
	}

}
