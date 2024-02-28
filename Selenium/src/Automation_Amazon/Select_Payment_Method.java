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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Select_Payment_Method 
{

	@Test
	public void E2E() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new 	FileInputStream("C:\\Eclipse\\Selenium\\Exel data\\Input1.xlsx");
		Workbook wb=	WorkbookFactory.create(f1);
		//String un1=			wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String un1 = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
		String pwd=			wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		//String pwd = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(1).getNumericCellValue());
		
		ChromeDriver driver = new ChromeDriver();
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
		
		WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
		
		Search.sendKeys("Books on india");
		Search.sendKeys(Keys.ENTER);
		
		WebElement Book = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[3]"));
		Book.click();
		
		Set <String> pid_cid = driver.getWindowHandles();
		Iterator<String> count = pid_cid.iterator();
		String pid =count.next();
		String cid = count.next();
		
		driver.switchTo().window(cid);
		WebElement Add_Cart = driver.findElement(By.id("add-to-cart-button"));
		Add_Cart.click();
		
		WebElement Proceed_Buy = driver.findElement(By.id("sc-buy-box-ptc-button"));
		Proceed_Buy.click();
		
		//driver.findElement(By.xpath("(//input[@class='a-button-input'])[4]")).click();
		
		WebElement Use_Address = driver.findElement(By.id("shipToThisAddressButton"));
		Use_Address.click();
	
		WebElement Select_Debit = driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']"));
		Select_Debit.click();	
		
		WebElement Net_Banking = driver.findElement(By.xpath("//input[@value='instrumentId=NetBanking&isExpired=false&paymentMethod=NB&tfxEligible=false']"));
		Net_Banking.click();
		
		WebElement Other_UPI = driver.findElement(By.xpath("//input[@value='instrumentId=amzn1.pm.poa.YW16bjEucG9hOmFtem4xLnBvYS5wb2RhLlVuaWZpZWRQYXltZW50c0ludGVyZmFjZTox.QVFNVkhYT1pBSzdNVw&isExpired=false&paymentMethod=UnifiedPaymentsInterface&tfxEligible=false']"));
		Other_UPI.click();
		
		
		WebElement Emi = driver.findElement(By.xpath("//input[@value='instrumentId=EMI&isExpired=false&paymentMethod=CC&tfxEligible=false']"));
		Emi.click();
	
		
		
		
}
}
