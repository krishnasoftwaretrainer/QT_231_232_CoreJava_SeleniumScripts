package selenium_basic_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class DownloadMultipleFiles 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		Thread.sleep(2000);
		
		//Scroll WebPage [Vertical Scroll(Top to Bottom and Bottom to Top) and Horizontal Scroll(Left to Right and Right to Left)]
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)"); //Vertical Scroll(Top to Bottom)
		Thread.sleep(2000);
		
		//Click on Download Button 
		WebElement Download=driver.findElement(By.linkText("Download"));
		Download.click();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,500)"); //Vertical Scroll(Top to Bottom)
		Thread.sleep(2000);
		
		//Enter Text in First TextArea
		WebElement FirstTextArea=driver.findElement(By.id("textbox"));
		FirstTextArea.sendKeys("Selenium \n WebDriver \n Java \n Automation Testing");
		Thread.sleep(2000);
		
		//Click on Generate File Button for First TextArea
		driver.findElement(By.id("createTxt")).click();
		Thread.sleep(2000);
		
		//Click on Download Button for First TextArea
		driver.findElement(By.id("link-to-download")).click();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,600)"); //Vertical Scroll(Top to Bottom)
		Thread.sleep(2000);
		
		//Enter Text in Second TextArea
		WebElement SecondTextArea=driver.findElement(By.id("pdfbox"));
		SecondTextArea.sendKeys("Selenium \n WebDriver \n Java \n Automation Testing");
		Thread.sleep(2000);
		
		//Click on Generate File Button for Second TextArea
		driver.findElement(By.id("createPdf")).click();
		Thread.sleep(2000);
		
		//Click on Download Button for Second TextArea
		driver.findElement(By.id("pdf-link-to-download")).click();
		
		Thread.sleep(4000);
		driver.quit();
		
	}

}
