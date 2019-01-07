package first;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class Datap 
{
	@DataProvider(name="testdata")
	public String[][] test2() throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException
	{
		Workbook wb=WorkbookFactory.create(new FileInputStream("D://Project Automation//project//Excel//data.xlsx"));
		int row=wb.getSheet("Sheet1").getLastRowNum();
		System.out.println(row);
		int col=wb.getSheet("Sheet1").getRow(0).getLastCellNum();
		System.out.println(col);
		String[][] str=new String[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				Cell cell=wb.getSheet("Sheet1").getRow(i).getCell(j);
				str[i][j]=cell.toString();
				System.out.println(cell);
			}
		}
		return str;
}
}
	
