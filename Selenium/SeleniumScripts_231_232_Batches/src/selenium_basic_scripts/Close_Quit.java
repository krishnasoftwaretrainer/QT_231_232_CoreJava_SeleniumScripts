package selenium_basic_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Quit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		String saucewindow=driver.getWindowHandle();
		//Swith to new Tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		String fbwindow=driver.getWindowHandle();
				
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.quit();
		//driver.close();
		/*
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(fbwindow);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(saucewindow);
		driver.close();
		*/
		
		
		
		
		

	}

}
