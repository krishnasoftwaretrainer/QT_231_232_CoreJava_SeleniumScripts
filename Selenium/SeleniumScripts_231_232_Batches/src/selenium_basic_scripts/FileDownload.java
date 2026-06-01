package selenium_basic_scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		
		WebElement downloadseleniumjava=driver.findElement(By.xpath("//a[@href=\"https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.44.0/selenium-java-4.44.0.zip\"]"));
		downloadseleniumjava.click();
	}

}
