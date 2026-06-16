package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_SwagLabs_TestData_Excel_DataDriven 
{
	
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	
	//Constructor
	public Read_SwagLabs_TestData_Excel_DataDriven(String excelSheetPath) throws IOException 
	{
		FileInputStream inputstream = new FileInputStream(excelSheetPath);
		workbook = new XSSFWorkbook(inputstream);
		
	}
	
	//Method-1
	public String getExcelData(int SheetIndex,int rows,int columns)
	{
		 sheet=workbook.getSheetAt(SheetIndex);
		
		 String data=sheet.getRow(rows).getCell(columns).getStringCellValue();
		 		 
		 return data;
		
	}
	
	//Method-2
	public int getRowCount(int SheetIndex)
	{
		int rowcount=workbook.getSheetAt(SheetIndex).getLastRowNum();
		rowcount=rowcount+1; //1 2 3 4
		return rowcount;
	}

}
