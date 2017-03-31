package dataprovider;

import java.io.File;
import java.io.FileInputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Exceldataread {
	Workbook wb;
	Sheet sheet;
	Cell cell;
	public Exceldataread() throws Exception{
		File file= new File("./Applicationtestdata/credentials.xls");
		FileInputStream fin= new FileInputStream(file);
		wb= Workbook.getWorkbook(fin);
	}
	public String getcellvalue(int sheetnumber, int colnum,int rownum){

		sheet=wb.getSheet(sheetnumber);
		cell=sheet.getCell(colnum, rownum);
		String celldata=cell.getContents();
		return celldata;
	}
	public int gettotalrowcount(int sheetnum){
		int totalrow=wb.getSheet(sheetnum).getRows();
		return totalrow;

	}
}
