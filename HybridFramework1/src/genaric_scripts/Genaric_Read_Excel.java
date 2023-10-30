package genaric_scripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public abstract class Genaric_Read_Excel 
{
	public String Excel() throws EncryptedDocumentException, IOException 
	{
			String value="";
			FileInputStream fis=new FileInputStream("./Excel/testdata.xlsx");
			Workbook book=WorkbookFactory.create(fis);
			Sheet sh = book.getSheet("Sheet1");
			Row r=sh.getRow(0);
			Cell c = r.getCell(0);
			value=c.toString();
			System.out.println("val");
			return value;
	}
}

