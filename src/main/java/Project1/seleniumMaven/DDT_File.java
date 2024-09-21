package Project1.seleniumMaven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_File
{
	String un;
	String pw;
public void username_password() throws EncryptedDocumentException, IOException
{
	FileInputStream f1=new FileInputStream("C:\\Users\\mailt\\eclipse-workspace\\SeleniumBasics\\src\\Amazon.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	Sheet s1=w1.getSheet("Sheet1");
	un=s1.getRow(1).getCell(0).getStringCellValue();
	pw=s1.getRow(1).getCell(1).getStringCellValue();
}

}
