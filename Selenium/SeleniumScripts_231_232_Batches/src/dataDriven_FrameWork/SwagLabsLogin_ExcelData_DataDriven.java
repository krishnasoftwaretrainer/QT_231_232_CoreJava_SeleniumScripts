package dataDriven_FrameWork;
import org.testng.annotations.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

import org.openqa.selenium.*;


public class SwagLabsLogin_ExcelData_DataDriven 
{
	
	@DataProvider(name="SwagLoginAllTestData")
	public Object[][] SwagLoginTestData() throws IOException  
	{
		Read_SwagLabs_TestData_Excel_DataDriven readExcel=new Read_SwagLabs_TestData_Excel_DataDriven("D:\\QT\\Selenium 231 & 232 Batch\\ExcelData\\SwagAllTestData_Excel.xlsx");
		
		int rowcount=readExcel.getRowCount(0);
		
		Object [][] swagLoginData=new Object[rowcount-1][2]; //7 rows and 2 columns
		
		
		for(int i=1;i<rowcount;i++)//1<8 2<8 3<8 4<8 5<8 6<8 7<8 8<8F
		{
			swagLoginData[i-1][0]=readExcel.getExcelData(0, i, 0); //0 0 1 0 2 0 
			swagLoginData[i-1][1]=readExcel.getExcelData(0, i, 1); //0 1 1 1 2 1
		}
		
		
		
		/*
		 This Script Reads the Header of Excel Sheet
		Object [][] swagLoginData=new Object[rowcount][2]; //7 rows and 2 columns
		
		
		for(int i=0;i<rowcount;i++)//0<8 1<8 2<8 3<8 4<8 5<8 6<8 7<8 8<8F
		{
			swagLoginData[i][0]=readExcel.getExcelData(0, i, 0); //0 0 1 0 2 0 
			swagLoginData[i][1]=readExcel.getExcelData(0, i, 1); //0 1 1 1 2 1
		}  */
		return swagLoginData;
		
	}
	

	WebDriver driver;
	
	@BeforeMethod
	public void BrowserSetup() throws InterruptedException
	{
		 driver=new EdgeDriver();
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("https://www.saucedemo.com/");
		 Thread.sleep(2000);
	}
	
	@Test(dataProvider="SwagLoginAllTestData")
	public void SwagLabsLoginTest(String username,String password) throws InterruptedException
	{
		  WebElement usernameL=driver.findElement(By.id("user-name"));
		 usernameL.sendKeys(username);
		 Thread.sleep(2000);
		 
		 WebElement passwordL=driver.findElement(By.id("password"));
		 passwordL.sendKeys(password);
		 Thread.sleep(2000);
		 
		 WebElement loginL=driver.findElement(By.id("login-button"));
		 loginL.click();
		 Thread.sleep(2000);
		 
	}
	
	@AfterMethod
	public void BrowserTearDown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}
	
	
}
