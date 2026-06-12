package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop extends BrowserConfig_Parent
{
		
	public void DragDrop() throws InterruptedException
	{
		//BrowserConfig();
		Actions actions = new Actions(driver);
		
		WebElement dragMe = driver.findElement(By.id("draggable"));
		WebElement dropHere = driver.findElement(By.id("droppable"));
		
		actions.dragAndDrop(dragMe, dropHere).perform();
		Thread.sleep(2000);
		 driver.quit();
	}

	public static void main(String[] args) throws InterruptedException 
	{
		Drag_Drop drag_Drop = new Drag_Drop();
		drag_Drop.BrowserConfig();
		drag_Drop.DragDrop();
	
		
		
		
	}

}
