package selenium_basic_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Open_Maximaize_Close 
{

	public static void main(String[] args) throws InterruptedException 
	{
		/* 1.Open Browser[Chrome,Edge,FireFox,Safari]
		 * 2.Maximize Browser
		 * 3.Close the Browser 
		 */
		
		//1.Create Object for Selenium WebDriver 
		//Openes the Chrome Browser
		/*
		WebDriver driver=new ChromeDriver();//Open
		Thread.sleep(2000);
		driver.manage().window().maximize(); //Maximize
		Thread.sleep(5000);
		driver.close(); //Close 
		*/
		
		//Microsoft Edge Browser
		/*
		WebDriver driver=new EdgeDriver();
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.close();
			*/
		
		//FireFox Browser
		/*
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.close();
		*/
		
		WebDriver driver;
		
		driver=new ChromeDriver();//Open
		Thread.sleep(2000);
		driver.manage().window().maximize(); //Maximize
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		System.out.println("URL is opened successfully");
		Thread.sleep(2000);
		driver.close(); //Close /
		System.out.println("Chrome");
		
		driver=new EdgeDriver();
		Thread.sleep(2000);
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		System.out.println("URL is opened successfully");
		Thread.sleep(2000);
		driver.close();
		System.out.println("Edge");
		
		
		driver=new FirefoxDriver();
		Thread.sleep(2000);
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		System.out.println("URL is opened successfully");
		Thread.sleep(2000);
		driver.close();
		System.out.println("FireFox");
		
		
	}

}
