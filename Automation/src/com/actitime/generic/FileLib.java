package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
 public String getPropertyData(String key) throws IOException{
	FileInputStream fis=new FileInputStream("./data/commandata.property") ;
	Properties p=new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;
 }
 public String getExcelData(String key,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx") ;
	
	Workbook wb = WorkbookFactory.create(fis);
	String data1 = wb.getSheet(key).getRow(row).getCell(cell).getStringCellValue();
	
	return data1;
 }
 public void setExcelData(String key,String data,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx") ;
// create will throw IO exception and workbook will throw encryptedDocumentedException
		Workbook wb = WorkbookFactory.create(fis);
		 wb.getSheet(key).getRow(row).getCell(cell).setCellValue(data);
		 FileOutputStream fos= new FileOutputStream("./data/testscript.xlsx");
		 wb.write(fos);
		 
		 
	
	
	
}
}