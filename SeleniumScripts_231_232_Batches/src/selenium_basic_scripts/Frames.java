package selenium_basic_scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frames {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		
		//Switch to single frame
		//driver.switchTo().frame(0);
		driver.switchTo().frame("SingleFrame");
		Thread.sleep(2000);
		
		WebElement SingleFrameTextBox = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		SingleFrameTextBox.sendKeys("Single Frame");
		Thread.sleep(2000);
		
		//Exit from Previous Frame: driver.switchTo().defaultContent();
		//Clck on Iframe with in an Iframe Button
		//SwithTo Outer Frame
		//Switch to Inner Frame
		//Enter text in Inner Frame Text Box
		
		driver.switchTo().defaultContent(); //Exit from Previous Frame
		Thread.sleep(2000);
		WebElement iframeWithInAnIframe = driver.findElement(By.xpath("//a[text()=\"Iframe with in an Iframe\"]"));
		iframeWithInAnIframe.click();
		Thread.sleep(2000);
		
		//Switch to Outer Frame
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(outerFrame);
		Thread.sleep(2000);
		
		//Switch to Inner Frame
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
		driver.switchTo().frame(innerFrame);
		Thread.sleep(2000);
		
		//Enter text in Inner Frame Text Box
		WebElement innerFrameTextBox = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		innerFrameTextBox.sendKeys("Inner Frame");
		Thread.sleep(2000);
		
		//Exit from all Frames
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
