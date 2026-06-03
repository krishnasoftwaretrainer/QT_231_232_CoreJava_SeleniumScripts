package selenium_basic_scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Screenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);

		// Screen Shot-1
		File sc1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc1, new File("D:\\QT\\Selenium 231 & 232 Batch\\Screenshots\\1Amazon.png"));

		driver.navigate().back(); // Facebook
		Thread.sleep(2000);

		// Screen Shot-2
		File sc2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc2, new File("D:\\QT\\Selenium 231 & 232 Batch\\Screenshots\\2FaceBook.png"));

		driver.navigate().back(); // SauceDemo
		Thread.sleep(2000);

		// Screen Shot-2
		File sc3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc3, new File("D:\\QT\\Selenium 231 & 232 Batch\\Screenshots\\3SauceDemo.png"));

		driver.navigate().forward(); // Facebook
		Thread.sleep(2000);

		// Screen Shot-3
		File sc4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc4, new File("D:\\QT\\Selenium 231 & 232 Batch\\Screenshots\\4Facebook.png"));

		driver.navigate().forward(); // Amazon
		Thread.sleep(2000);

		// Screen Shot-4
		File sc5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc5, new File("D:\\QT\\Selenium 231 & 232 Batch\\Screenshots\\5Amazon.png"));

		driver.navigate().refresh(); // Amazon
		Thread.sleep(2000);

		// Screen Shot-5
		File sc6 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc6, new File("D:\\QT\\Selenium 231 & 232 Batch\\Screenshots\\6Amazon.png"));

		Thread.sleep(2000);
		driver.quit();
	}

}
