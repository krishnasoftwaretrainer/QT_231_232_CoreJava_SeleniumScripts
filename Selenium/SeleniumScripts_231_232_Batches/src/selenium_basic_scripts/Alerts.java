package selenium_basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		// Alert with OK
		WebElement alertWithOkButton = driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]"));
		alertWithOkButton.click();
		Thread.sleep(2000);
		//get Alert text
		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert1 Text: "+alertText);
		
		//Accept the alert
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		//Click on Alert with OK & Cancel
		WebElement alertWithOkCancelButton = driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]"));
		alertWithOkCancelButton.click();
		Thread.sleep(2000);
		WebElement clickMeButton = driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]"));
		clickMeButton.click();
		Thread.sleep(2000);
		//get Alert text
		String alertText2 = driver.switchTo().alert().getText();
		System.out.println("Alert2 Text: "+alertText2);
		//Dismiss the alert
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		WebElement AfteralertText = driver.findElement(By.id("demo"));
		System.out.println("After Alert Text: "+AfteralertText.getText());
		Thread.sleep(2000);
		driver.quit();
	}

}
