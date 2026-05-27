package selenium_basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWebPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		//Scrolling the page use JavaScriptExecutor Interface
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		/*
		js.executeScript("window.scrollBy(0,100)"); //scroll down
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500)"); //scroll up
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(500,0)"); //scroll right
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-500,0)"); //scroll left
		*/
		
		//Scroll to Specific WebElement
		WebElement Skills=driver.findElement(By.id("Skills"));
		js.executeScript("arguments[0].scrollIntoView();", Skills);
		
		//Left to right[500] scroll and right to left scroll[-500]
		//Top to bottom[500] scroll and bottom to top scroll[-500]
	}

}
