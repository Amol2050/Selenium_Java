//Verify that items can be added to the shopping cart from the product pages

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
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AddToCart_FrmProdPage {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1=new 	FileInputStream("C:\\Eclipse\\Selenium\\Exel data\\Input1.xlsx");
		Workbook wb=	WorkbookFactory.create(f1);
		//String un1=			wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String un1 = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
		String pwd=			wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		//String pwd = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(1).getNumericCellValue());
		
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
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nikon camera");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		//WebElement Nikon = driver.findElement(By.xpath("(//span[@class='rush-component s-latency-cf-section']/div/div)[6]"));
		WebElement Nikon = driver.findElement(By.xpath("(//div[@class='a-section']/div/div)[5]"));
		Nikon.click();
		
		//(//div[@class='a-section']/div/div)[1]
		
		Set <String> pid_cid = driver.getWindowHandles();
		Iterator<String> count = pid_cid.iterator();
		String pid =count.next();
		String cid = count.next();
		driver.switchTo().window(cid); 
		
		WebElement Add_Cart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		
		Assert.assertEquals(Add_Cart.isDisplayed(), false);
		Add_Cart.click();
		
		/* if(Add_Cart.isDisplayed() == true)
		{
			Add_Cart.click();
			
		}
		else
		{
			System.out.println("Product is Unavailable or Add to Cart button is not available");
		} */
		
	}

}
