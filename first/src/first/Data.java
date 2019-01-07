package first;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataProvider1 {

	@DataProvider
	public String[][] test1() throws Exception {
		Workbook wb = WorkbookFactory.create(new FileInputStream("F:\\TestYantra\\ExtentReports\\Hari.xlsx"));
		int row = wb.getSheet("sheet1").getPhysicalNumberOfRows();
		System.out.println(row);
		int col = wb.getSheet("sheet1").getRow(0).getLastCellNum();
		System.out.println(col);
		String [][]str = new String[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				Cell cell = wb.getSheet("sheet1").getRow(i).getCell(j);
				str[i][j] =cell.toString();
				System.out.println(cell);
			}
			
		}
		return str;
	}
	@Test(dataProvider="test1")
	public void test(String un , String pw) {
		System.out.println(un + " " + pw);
	}

}
