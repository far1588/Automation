package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataWithoutHardCoding {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis= new FileInputStream("./data/testscript.xlsx");
Workbook wb = WorkbookFactory.create(fis);
int rowcount = wb.getSheet("createcustomer").getLastRowNum();

short cellcount= wb.getSheet("createcustomer").getRow(0).getLastCellNum();
 
for(int i=1;i<=rowcount;i++)
{
	for(int j=0;j<cellcount;j++)
	{
		String data = wb.getSheet("createcustomer").getRow(i).getCell(j).getStringCellValue();
		System.out.println(data);
	}
}
	}

}
