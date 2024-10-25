package Airline_Project.AirlineProject2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDT_File 
{
	static String un;
	static String pw;
	static String un1;
	static String pw1;
	static String un2;
	static String pw2;
	static String cardnum;
	static String name;
	static String expmon;
	static String expyear;
	static String cvvnum;
	static String mobile;
public static void username_password() throws EncryptedDocumentException, IOException
{
	FileInputStream f1=new FileInputStream("C:\\Users\\mailt\\eclipse-workspace\\AirlineProject2\\src\\Amazon.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	Sheet s1=w1.getSheet("login");
	un=s1.getRow(1).getCell(0).getStringCellValue();
	pw=s1.getRow(1).getCell(1).getStringCellValue();
}
public static void creditcarddetails() throws EncryptedDocumentException, IOException
{
	FileInputStream f1=new FileInputStream("C:\\Users\\mailt\\eclipse-workspace\\AirlineProject2\\src\\Amazon.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	Sheet s1=w1.getSheet("creditcarddetails");
	cardnum=NumberToTextConverter.toText(s1.getRow(0).getCell(1).getNumericCellValue());
	name=s1.getRow(1).getCell(1).getStringCellValue();
	expmon=NumberToTextConverter.toText(s1.getRow(2).getCell(1).getNumericCellValue());
	expyear=NumberToTextConverter.toText(s1.getRow(3).getCell(1).getNumericCellValue());
	cvvnum=NumberToTextConverter.toText(s1.getRow(4).getCell(1).getNumericCellValue());
	if(expmon.length()==1)
	{
		expmon="0"+expmon;
	}
	
}
public static void login2() throws EncryptedDocumentException, IOException
{
	FileInputStream f1=new FileInputStream("C:\\Users\\mailt\\eclipse-workspace\\AirlineProject2\\src\\Amazon.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	Sheet s1=w1.getSheet("login1");
	un=s1.getRow(1).getCell(0).getStringCellValue();
	pw=s1.getRow(1).getCell(1).getStringCellValue();
}
public static void incorrectunpw() throws EncryptedDocumentException, IOException
{
	FileInputStream f1=new FileInputStream("C:\\Users\\mailt\\eclipse-workspace\\AirlineProject2\\src\\Amazon.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	Sheet s1=w1.getSheet("incorrectCredentials");
	un=s1.getRow(1).getCell(0).getStringCellValue();
	pw=s1.getRow(1).getCell(1).getStringCellValue();
}
public static void registration1() throws EncryptedDocumentException, IOException
{
	FileInputStream f1=new FileInputStream("C:\\Users\\mailt\\eclipse-workspace\\AirlineProject2\\src\\Amazon.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	Sheet s1=w1.getSheet("register");
	un=s1.getRow(0).getCell(1).getStringCellValue();
	mobile=NumberToTextConverter.toText(s1.getRow(1).getCell(1).getNumericCellValue());
	pw=s1.getRow(2).getCell(1).getStringCellValue();
}
public static void Travellername() throws EncryptedDocumentException, IOException
{
	FileInputStream f1=new FileInputStream("C:\\Users\\mailt\\eclipse-workspace\\AirlineProject2\\src\\Amazon.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	Sheet s1=w1.getSheet("travellername");
	un=s1.getRow(0).getCell(0).getStringCellValue();
	pw=s1.getRow(0).getCell(1).getStringCellValue();
	un1=s1.getRow(1).getCell(0).getStringCellValue();
	pw1=s1.getRow(1).getCell(1).getStringCellValue();
}
public static void mobile() throws EncryptedDocumentException, IOException
{
	FileInputStream f1=new FileInputStream("C:\\Users\\mailt\\eclipse-workspace\\AirlineProject2\\src\\Amazon.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	Sheet s1=w1.getSheet("mobile");
	un=NumberToTextConverter.toText(s1.getRow(0).getCell(1).getNumericCellValue());
	pw=s1.getRow(1).getCell(1).getStringCellValue();
}


}
