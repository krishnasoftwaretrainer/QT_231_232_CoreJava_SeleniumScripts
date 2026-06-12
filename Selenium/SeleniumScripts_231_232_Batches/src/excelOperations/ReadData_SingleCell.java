package excelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadData_SingleCell {

	public static void main(String[] args) throws IOException
	{
	
		
		String fileaddress = "D:\\QT\\Selenium 231 & 232 Batch\\ExcelData\\WriteDataSingleCell.xlsx";
		FileInputStream inputstream = new FileInputStream(fileaddress);
	
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		XSSFRow row=sheet.getRow(10);
		
		XSSFCell cell=row.getCell(5);
		
		String cellvalue=cell.getStringCellValue();
		System.out.println("Data from the Cell is: "+cellvalue);
		
		workbook.close();
		
	
	}

}
