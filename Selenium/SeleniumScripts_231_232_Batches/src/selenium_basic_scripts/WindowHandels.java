package selenium_basic_scripts;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandels {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		Set<String> AllWindowHandles=driver.getWindowHandles();
		System.out.println("All Window Handles: "+AllWindowHandles);
		Thread.sleep(2000);
		//driver.close();
		driver.quit();
		
		
		/*
		String saucewindow=driver.getWindowHandle();
		//Swith to new Tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		String fbwindow=driver.getWindowHandle();
				
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		String amazonwindow=driver.getWindowHandle();
		Thread.sleep(2000);
		
		driver.switchTo().window(saucewindow);
		Thread.sleep(2000);
		driver.switchTo().window(amazonwindow);
		Thread.sleep(2000);
		
		System.out.println("SauceDemo Window: "+saucewindow);
		System.out.println("Facebook Window: "+fbwindow);
		System.out.println("Amazon Window: "+amazonwindow);
		*/
	}

}
