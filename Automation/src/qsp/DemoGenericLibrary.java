package qsp;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.actitime.generic.FileLib;

public class DemoGenericLibrary {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileLib f=new FileLib();
String url = f.getPropertyData("url");
System.out.println(url);
String cn = f.getExcelData("createcustomer", 0, 2);
System.out.println(cn);
f.setExcelData("createcustomer", "f", 1, 1);


	}

}
