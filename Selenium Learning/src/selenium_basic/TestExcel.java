package selenium_basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestExcel {
	
	
@Test(priority=1, dataProvider="login")	
	
	//@Parameters({"browser_name","url"})
	public void validate_login(String username, String password)
{
System.out.println(username);	
System.out.println(password);	

}
	
	
	@DataProvider(name="login")
	public Object[][] logindata() throws Exception
	{
		String Path="C:/Excell.xlsx";
		String Sheet="Test";
		Object[][] arrayobj = TestExcel.readfromexcel(Path, Sheet);
				return arrayobj;
		
	}
	
	
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
		  


	
	
	public String[][] getexcelldata(String filepath,String sheet ) throws Exception 
	{
	
	
		
		File f= new File(filepath);
		FileInputStream fis = new FileInputStream(f);
		
		
		XSSFWorkbook wb=new  XSSFWorkbook(fis);
		XSSFSheet sh= wb.getSheet(sheet);
		
		int no_row = sh.getLastRowNum();
		Row header_row = sh.getRow(0);
		int column = header_row.getLastCellNum();
		
		
String[][] arrayexcelldata = new String[no_row][column];
		
		for (int i= 1;i<=no_row+1; i++ )
		{
			Row curr_row = sh.getRow(i);
			for (int j=0; j <= column ; j++)
			{
				//arrayexcelldata[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
				arrayexcelldata[i][j] = curr_row.getCell(j).getStringCellValue();
				
			}

		}
		
	
	wb.close();
		return arrayexcelldata;
	}

}
