package excelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_MultipleCells {

	public static void main(String[] args) throws IOException {
		String fileaddress = "D:\\QT\\Selenium 231 & 232 Batch\\ExcelData\\WriteDataMiltipleCellsSingleRow.xlsx";
		FileInputStream inputstream = new FileInputStream(fileaddress);
	
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		
		//XSSFSheet sheet=workbook.getSheetAt(0);
		XSSFSheet sheet=workbook.getSheet("Multiple Cells Data");
		
		//Use nested for Loop to read multiple cells data
		int rowcount=sheet.getLastRowNum(); //1
		//for(int i=0;i<2;i++)  //Outer loop for Row i<1 0<2:T 1<2:T 2<2:F
		
		for(int i=0;i<=rowcount;i++)
		{
			XSSFRow row=sheet.getRow(i);  //0
			
			int cellcount=row.getLastCellNum(); //5
			//for(int j=0;j<5;j++)  //j<5 0<5:T 1<5:T
			
			for(int j=0;j<cellcount;j++)
			{
				XSSFCell cell=row.getCell(j); //0 1
				String cellvalue=cell.getStringCellValue();
				System.out.print(cellvalue+"  ||  ");
			}
			System.out.println();
			
		}
	
		
		
		
		/*
		XSSFRow row=sheet.getRow(0);
		
		XSSFCell cell0=row.getCell(0);
		
		String cellvalue=cell0.getStringCellValue();
		
		XSSFCell cell1=row.getCell(1);
		String cellvalue1=cell1.getStringCellValue();
		
		XSSFCell cell2=row.getCell(2);
		String cellvalue2=cell2.getStringCellValue();
		
		System.out.println("Data from the Cell is: "+cellvalue);
		System.out.println("Data from the Cell is: "+cellvalue1);
		System.out.println("Data from the Cell is: "+cellvalue2);
		*/
		
		workbook.close();

	}

}
