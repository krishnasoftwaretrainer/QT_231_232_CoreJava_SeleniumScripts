package selenium_basic_scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_LinkText_PartialLinkText 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//1.Link Text [Click on Forgotten Password?]
		WebElement ForgotPwd=driver.findElement(By.linkText("Forgotten passwo"));
		ForgotPwd.click();
		
		//2.Partial Link Text [Click on Forgotten Password?]
		//WebElement ForgotPwd=driver.findElement(By.partialLinkText("Forgotten"));
		//ForgotPwd.click();
	}

}
