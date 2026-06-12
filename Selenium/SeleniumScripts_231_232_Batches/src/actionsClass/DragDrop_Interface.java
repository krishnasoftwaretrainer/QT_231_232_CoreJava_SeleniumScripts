package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

interface BrowserC  //Parent1
{
	public void BrowserConfig() throws InterruptedException;
}
interface BrowserCl  //Parent2
{
	public void BrowserClose() ;
}
interface DragDrop  //Parent3
{
	public void Drag_Drop() throws InterruptedException;
	
}

public class DragDrop_Interface implements BrowserC,BrowserCl,DragDrop
{
	WebDriver driver;
	public void BrowserConfig() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		Thread.sleep(2000);
	}

	public void Drag_Drop() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		
		WebElement dragMe = driver.findElement(By.id("draggable"));
		WebElement dropHere = driver.findElement(By.id("droppable"));
		
		actions.dragAndDrop(dragMe, dropHere).perform();
		Thread.sleep(2000);
		
	}
	public void BrowserClose()
	{
	driver.close();
	
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		DragDrop_Interface drag=new DragDrop_Interface();
		drag.BrowserConfig();
		drag.Drag_Drop();
		drag.BrowserClose();
		
		
	}
	
}
