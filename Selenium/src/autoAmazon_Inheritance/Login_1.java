package autoAmazon_Inheritance;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Login_1 extends Launch
{
	

	public static void main(String args[]) throws EncryptedDocumentException, IOException 
	{
		
		edge_browser();
		
		WebElement e = edriver.findElement(By.id("nav-link-accountList"));
		Actions a = new Actions(edriver);
		a.moveToElement(e).perform();
		
		
		WebElement e1 = edriver.findElement(By.linkText("Sign in"));
		e1.click();

		Login_1 s5 = new Login_1();
		s5.file(username,password);
		
		WebElement Username =	edriver.findElement(By.xpath("//input[@name='email']"));
		Username.sendKeys(username);

		edriver.findElement(By.id("continue")).click();
		
		edriver.findElement(By.id("ap_password")).sendKeys(password);
		edriver.findElement(By.id("signInSubmit")).click();
		
		
	}

}
