package selenium_basic_scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		//FindElements() method: It is used to find multiple web elements and return the list of web elements.
		//FindElement() method: It is used to find single web element and return the web element.
		//FindElement returns WebElement and FindElements returns List<WebElement>
		//Findelement not found: NoSuchElementException and FindElements not found: Empty List
		
		List<WebElement> CheckBoxes=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
		System.out.println("Total CheckBoxes: "+CheckBoxes.size());
		
		//for(int i=0;i<CheckBoxes.size();i++) //3 0 1 2
		
		for(WebElement CheckBox:CheckBoxes)
		{
			//CheckBoxes.get(i).click();
			CheckBox.click();
			Thread.sleep(2000);
		}
		
	}

}
