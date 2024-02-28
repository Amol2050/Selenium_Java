package autoAmazon_Inheritance;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Edit_profile extends Launch
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
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
		
		WebElement Your_Accnt = edriver.findElement(By.id("nav-link-accountList"));
		Actions a1 = new Actions(edriver);
		a1.moveToElement(Your_Accnt).perform();
		edriver.findElement(By.linkText("Your Account")).click();
		
		WebElement Login_Security = edriver.findElement(By.xpath("//span[.='Edit login, name, and mobile number']"));
		Login_Security.click();
		
		WebElement Edit = edriver.findElement(By.xpath("(//a[.='Edit'])[1]"));
		Edit.click();
		
		WebElement New_Name = edriver.findElement(By.id("ap_customer_name"));
		New_Name.sendKeys("Amol D");
		edriver.findElement(By.className("a-button-inner")).click();
	}

}
