//Ensure that the product detail page displays all necessary information(price,reviews,description).
package Automation_Amazon;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import graphql.Assert;

public class Display_Prod_Info 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1=new 	FileInputStream("C:\\Eclipse\\Selenium\\Exel data\\Input1.xlsx");
		Workbook wb=	WorkbookFactory.create(f1);
		//String un1=			wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String un1 = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
		String pwd=			wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		//String pwd = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(1).getNumericCellValue());
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
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
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Adidas Basic Sneakers");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		WebElement Shoe = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro']/div/h2)[7]"));
		Shoe.click();
		
		Set <String> pid_cid = driver.getWindowHandles();
		Iterator<String> count = pid_cid.iterator();
		String pid =count.next();
		String cid = count.next();
		
		driver.switchTo().window(cid);
		WebElement Prod_Details = driver.findElement(By.xpath("//h2[.='Product details']"));
		String Prod_Text = Prod_Details.getText();
		System.out.println(Prod_Text);
		//Assert.assertEquals(Prod_Text,"Product details");
		String Exp_Result = "Product details";
		//assert Exp_Result.equals(Prod_Text):"Test Failed";
		//int a =10;
		//int b=20;
		//assert a>20:"Failed";
		
		boolean b = Exp_Result.equals(Prod_Text);
		if(b== true)
		{
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("test case failed");
		}

		
		
		
	}

}
