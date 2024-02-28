package selenium.program;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fetch 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream f1=new 	FileInputStream("C:\\Eclipse\\Selenium\\Exel data\\Input.xlsx");
	Workbook wb=	WorkbookFactory.create(f1);
	Sheet s1=	wb.getSheet("login");
	Row r1=			s1.getRow(1);
	Cell c1=	r1.getCell(0);
	String un1 = c1.getStringCellValue();
	System.out.println(un1);
	Row r2=		s1.getRow(1);
	Cell c2=	r2.getCell(1);
	String pwd1=		c2.getStringCellValue();
	System.out.println(pwd1);

	EdgeDriver driver = new EdgeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement e = driver.findElement(By.id("nav-link-accountList"));
	Actions a = new Actions(driver);
	a.moveToElement(e).perform();
	
	WebElement e1 = driver.findElement(By.linkText("Sign in"));
	e1.click();
	driver.findElement(By.id("ap_email")).sendKeys(un1);
	driver.findElement(By.id("continue")).click();
	
	driver.findElement(By.id("ap_password")).sendKeys(pwd1);
	driver.findElement(By.id("signInSubmit")).click();
	
	
	
	}

}
