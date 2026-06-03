package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Type_CapitalLetters {

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
		action.keyDown(Keys.SHIFT).sendKeys("abcdefgh").keyUp(Keys.SHIFT).build().perform();
	}

}
