package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select_Copy_Paste {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement FirstTextArea = driver.findElement(By.id("textbox"));

		js.executeScript("arguments[0].click();", FirstTextArea);
		Thread.sleep(2000);

		Actions action = new Actions(driver);
		action.moveToElement(FirstTextArea).click().build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.SHIFT).sendKeys("hai krishna").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(2000);
		
		//Ctrl+A and Ctrl+C and Ctrl+V
		action.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		Thread.sleep(2000);
		
		action.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		Thread.sleep(2000);
		
		WebElement PasteTextArea=driver.findElement(By.id("pdfbox"));
		js.executeScript("arguments[0].click();", PasteTextArea);
		Thread.sleep(2000);
		
		action.moveToElement(PasteTextArea).click().build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		Thread.sleep(2000);
		
		//action.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		//Thread.sleep(2000);
		
		//Click on Delete or Backspace key
		//action.sendKeys(Keys.DELETE).build().perform();
		action.sendKeys(Keys.BACK_SPACE).build().perform();
	}

}
