import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import javafx.scene.control.Cell;

public class ReadData 
{		
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("C.\\Login.xlsx");//path 
																	//of 
																	//excel 
																	//file
		Workbook wb = WorkbookFactory.create(fis);//loading the excel file
		Sheet sh = wb.getSheet("Login");//loaded sheet also
		int rowcount =  sh.getPhysicalNumberOfRows();//how many rows
		Row firstRow = sh.getRow(0);
		for(int row = 0;row<rowcount; row++)
		{for(int col = 0; col<firstRow.getFirstCellNum();col++)
		{Cell cl = (Cell) sh.getRow(row).getCell(col);
		System.out.println(cl);
	}}
}}	
