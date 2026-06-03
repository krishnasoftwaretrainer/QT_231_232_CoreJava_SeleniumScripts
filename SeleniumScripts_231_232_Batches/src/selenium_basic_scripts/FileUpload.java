package selenium_basic_scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUpload {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/FileUpload.html");
	Thread.sleep(2000);
	
	//File Upload using SendKeys() method
	WebElement BrowseFile=driver.findElement(By.id("input-4"));
	BrowseFile.sendKeys("D:\\Addition Defect.png");
	Thread.sleep(2000);
	
	BrowseFile.sendKeys("D:\\Addition Defect.png");
	
	}

}
