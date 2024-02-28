package selenium.program;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Naukri_Login_DDT 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream f = new FileInputStream("C:\\Eclipse\\Selenium\\Exel data\\Input.xlsx");
		Workbook wb=	WorkbookFactory.create(f);
		String uname = wb.getSheet("login").getRow(2).getCell(0).getStringCellValue();
		String pass = wb.getSheet("login").getRow(2).getCell(1).getStringCellValue();
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login_Layer"));
		WebElement user_name = driver.findElement(By.xpath("//input[@type='text']"));
		user_name.sendKeys(uname);
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys(pass);
		
	}

}
