package excell;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excellconfig {
	
	public static String [][] readfromexcel(String filepath,String sheetname) throws IOException {
		 FileInputStream fs = new FileInputStream(filepath);
		 Workbook wb = new XSSFWorkbook(fs); //to read data from .xlsx file we use XSSFWorkbook
		//Workbook wb = new HSSFWorkbook(fs); //to read data from .xls file we use HSSFWorkbook
		 Sheet sh = wb.getSheet(sheetname);
		 int rowcount = sh.getLastRowNum() - sh.getFirstRowNum() ;
		 Row header_row = sh.getRow(0);
		 int column_count = header_row.getLastCellNum();
		 String [][] data = new String [rowcount][column_count]; //rowcount-1 is incorrect
		 for (int r=1;r<=rowcount;r++){
			 Row rows = sh.getRow(r);
			for (int c=0;c<column_count;c++) {
				data [r-1][c] = rows.getCell(c).getStringCellValue();
				
			}
		 }
		 wb.close();
			 return data;
			 
	  }

}
