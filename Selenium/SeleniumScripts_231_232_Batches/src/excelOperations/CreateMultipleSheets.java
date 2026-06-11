package excelOperations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateMultipleSheets {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//File fileaddress = new File("D:\\QT\\Selenium 231 & 232 Batch\\ExcelData\\CreateMultipleSheets.xlsx");
		
		File fileaddress = new File("C:\\Users\\HP\\eclipse-workspace_232Batch\\SeleniumScripts_231_232_Batches\\src\\excelOperations\\SampleExcel.xlsx");
		FileOutputStream outputstream = new FileOutputStream(fileaddress);
				
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet Sheet1=workbook.createSheet("First Sheet");
		Thread.sleep(2000);
		System.out.println("First Sheet Created Successfully");
				
		XSSFSheet Sheet2=workbook.createSheet("Second Sheet");
		Thread.sleep(2000);
		System.out.println("Second Sheet Created Successfully");
		
		XSSFSheet Sheet3=workbook.createSheet("Third Sheet");
		Thread.sleep(2000);
		System.out.println("Third Sheet Created Successfully");
				
		XSSFSheet Sheet4=workbook.createSheet("Fourth Sheet");
		Thread.sleep(2000);
		System.out.println("Fourth Sheet Created Successfully");
		
		XSSFSheet Sheet5=workbook.createSheet("Fifth Sheet");
		Thread.sleep(2000);
		System.out.println("Fifth Sheet Created Successfully");
		Thread.sleep(2000);
		
		System.out.println("Multiple Sheets Created Successfully");
		
		workbook.write(outputstream);
		
		workbook.close();
	
	}

}
