package Automation_Amazon;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddToCart_FromProductPage 
{
	static WebDriver  driver;
	static String un1;
	static String pwd;
	void Launch() 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	void Get_Data() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new 	FileInputStream("C:\\Eclipse\\Selenium\\Exel data\\Input1.xlsx");
		Workbook wb=	WorkbookFactory.create(f1);
		String un1 = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
		String pwd =			wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		//String pwd = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(1).getNumericCellValue());
		
	}
	void Amazon_login()
	{
		/*EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();*/
		
		WebElement e = driver.findElement(By.id("nav-link-accountList"));
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		
		WebElement e1 = driver.findElement(By.linkText("Sign in"));
		e1.click();
		driver.findElement(By.id("ap_email")).sendKeys(un1);
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys(pwd);
		driver.findElement(By.id("signInSubmit")).click();
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		AddToCart_FromProductPage obj1 = new AddToCart_FromProductPage();
		obj1.Launch();
		obj1.Amazon_login();
		obj1.Get_Data();
		
	}

}
