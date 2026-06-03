package selenium_basic_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigations {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().back(); //Facebook
		Thread.sleep(2000);
		driver.navigate().back(); //SauceDemo
		Thread.sleep(2000);
		driver.navigate().forward(); //Facebook
		Thread.sleep(2000);
		driver.navigate().forward(); //Amazon
		Thread.sleep(2000);
		driver.navigate().refresh(); //Amazon
	}

}
