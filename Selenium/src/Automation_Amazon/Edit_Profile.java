//Check user can successfully edit their profile information

package Automation_Amazon;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Edit_Profile 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1=new 	FileInputStream("C:\\Eclipse\\Selenium\\Exel data\\Input1.xlsx");
		Workbook wb=	WorkbookFactory.create(f1);
		//String un1=			wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String un1 = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
		String pwd=			wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		//String pwd = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(1).getNumericCellValue());
		
		//FirefoxDriver driver = new FirefoxDriver();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.id("nav-link-accountList"));
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		
		WebElement e1 = driver.findElement(By.linkText("Sign in"));
		e1.click();
		driver.findElement(By.id("ap_email")).sendKeys(un1);
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys(pwd);
		driver.findElement(By.id("signInSubmit")).click();
		
		WebElement Your_Accnt = driver.findElement(By.id("nav-link-accountList"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(Your_Accnt).perform();
		driver.findElement(By.linkText("Your Account")).click();
		
		WebElement Login_Security = driver.findElement(By.xpath("//span[.='Edit login, name, and mobile number']"));
		Login_Security.click();
		
		WebElement Edit = driver.findElement(By.xpath("(//a[.='Edit'])[1]"));
		Edit.click();
		
		WebElement New_Name = driver.findElement(By.id("ap_customer_name"));
		New_Name.sendKeys("Amol D");
		driver.findElement(By.className("a-button-inner")).click();
	}

}
