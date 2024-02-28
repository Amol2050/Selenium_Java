package autoAmazon_Inheritance;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch 
{
	static String username=" ";
	static String password=" ";
	static EdgeDriver edriver = new EdgeDriver();
	static void edge_browser()
	{
		
		edriver.get("https://www.amazon.in/");
		edriver.manage().window().maximize();
		edriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	void file(String Username,String Password ) throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new 	FileInputStream("C:\\Eclipse\\Selenium\\Exel data\\Input1.xlsx");
		Workbook wb=	WorkbookFactory.create(f1);
		String username = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
		this.username=username;
		String password = wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		this.password=password;
		//String pwd = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(1).getNumericCellValue());
	}

}
