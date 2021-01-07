package Hello;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	@SuppressWarnings("deprecation")
	public ArrayList<String> getdata(String testcaseName) throws IOException
	{
ArrayList<String> a= new ArrayList<String>();
		
		FileInputStream fis= new FileInputStream("/home/abhishek/Downloads/Demo.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets= workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("rathore"))
					{
				XSSFSheet sheet = workbook.getSheetAt(i);
				//Identify testcases after scaning the entire first row
				Iterator<Row> rows=sheet.iterator(); //sheet is collection of rows
				Row firstrow= rows.next(); 
				Iterator<Cell> ce=firstrow.cellIterator(); //row is collection of cells
				int k=0;
				int column=0;
				while(ce.hasNext())
				{
					Cell value=ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("Testcase"))
					{
						column=k;   //desired column
					}
					k++;
				}
				System.out.println(column);
				
				//one column is identified,scan the column and find profile keyword
				while (rows.hasNext())
				{
					Row r=rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName))
					{
						//once profile row matched grabed all data of that row
						Iterator<Cell> cv=r.cellIterator();
						while(cv.hasNext())
						{
							
							Cell c = cv.next();
							if (c.getCellTypeEnum()==CellType.STRING)
							{
							 a.add(c.getStringCellValue()) ;
						    }
							else
							{
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
								
								

							}
								
							}
					}
					
				}
				
				
					}
			
		}
		return a;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
	}

}
