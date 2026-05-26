package selenium_basic_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();  //Open 
		Thread.sleep(5000);
		driver.manage().window().maximize(); //Maximize
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/"); //Enter URL 
		Thread.sleep(2000);
		driver.close();
		
	}

}
