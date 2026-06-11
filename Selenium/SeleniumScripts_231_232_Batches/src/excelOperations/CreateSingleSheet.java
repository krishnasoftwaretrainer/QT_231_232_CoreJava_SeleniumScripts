package excelOperations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class CreateSingleSheet {

	public static void main(String[] args) throws IOException 
	{
	
		File fileaddress = new File("D:\\QT\\Selenium 231 & 232 Batch\\ExcelData\\CreateSingleSheet.xlsx");
		FileOutputStream outputstream = new FileOutputStream(fileaddress);
				
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet Sheet1=workbook.createSheet("First Sheet");
		
		System.out.println("Sheet Created Successfully");
		
		workbook.write(outputstream);
		
		workbook.close();
	
		
	}

}
