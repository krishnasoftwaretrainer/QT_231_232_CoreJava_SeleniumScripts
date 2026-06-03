package selenium_basic_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		Thread.sleep(2000);
		
		WebElement addbutton = driver.findElement(By.id("addNewRecordButton"));
		addbutton.click();
		
		//FirstName LastName Email Age Salary Department
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("Krishna");
		Thread.sleep(1000);
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("Rao");
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("Krishna@gmail.com");
		Thread.sleep(1000);
		WebElement age = driver.findElement(By.id("age"));
		age.sendKeys("25");
		Thread.sleep(1000);
		WebElement salary = driver.findElement(By.id("salary"));
		salary.sendKeys("50000");
		Thread.sleep(1000);
		WebElement department = driver.findElement(By.id("department"));
		department.sendKeys("Testing");
		Thread.sleep(1000);
		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();
		Thread.sleep(2000);
		
		//Searching for the record
		WebElement searchbox = driver.findElement(By.id("searchBox"));
		searchbox.sendKeys("Krishna");
		System.out.println(searchbox.getAttribute("value"));
		
		Thread.sleep(2000);
		//Edit or Update the record
		WebElement editbutton = driver.findElement(By.id("edit-record-4"));
		editbutton.click();
		Thread.sleep(1000);
		
		WebElement FirstNameEdit = driver.findElement(By.id("firstName"));
		FirstNameEdit.clear();
		Thread.sleep(1000);
		FirstNameEdit.sendKeys("Rama");
		Thread.sleep(2000);
		WebElement submitEdit = driver.findElement(By.id("submit"));
		submitEdit.click();
		Thread.sleep(2000);
		
		//Delete the record
		WebElement deletebutton = driver.findElement(By.id("delete-record-4"));
		deletebutton.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.quit();
	}

}
