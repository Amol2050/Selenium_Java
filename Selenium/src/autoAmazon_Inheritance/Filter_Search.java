package autoAmazon_Inheritance;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Filter_Search extends Launch
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		edge_browser();
		
		WebElement e = edriver.findElement(By.id("nav-link-accountList"));
		Actions a = new Actions(edriver);
		a.moveToElement(e).perform();
		
		
		WebElement e1 = edriver.findElement(By.linkText("Sign in"));
		e1.click();

		Filter_Search s5 = new Filter_Search();
		s5.file(username,password);
		
		WebElement Username =	edriver.findElement(By.xpath("//input[@name='email']"));
		Username.sendKeys(username);

		edriver.findElement(By.id("continue")).click();
		
		edriver.findElement(By.id("ap_password")).sendKeys(password);
		edriver.findElement(By.id("signInSubmit")).click();
		
		edriver.findElement(By.id("twotabsearchtextbox")).sendKeys("camera");
		edriver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		//Filters
		edriver.findElement(By.xpath("//span[@class='a-expander-prompt']")).click(); //click on see more
		
		//Camera brand filter, Price, Deals & Discount
		WebElement Nikon = edriver.findElement(By.xpath("//span[.='Nikon']"));
		Nikon.click();
		WebElement Min = edriver.findElement(By.id("low-price"));
		Min.sendKeys("50000");
		WebElement Max = edriver.findElement(By.id("high-price"));
		Max.sendKeys("200000");
		WebElement Search = edriver.findElement(By.xpath("//input[@class='a-button-input']"));
		Search.click();
		WebElement Top_Brands = edriver.findElement(By.xpath("//span[.='Top Brands']"));
		Top_Brands.click();
		
		WebElement Discount = edriver.findElement(By.xpath("//span[.='10% Off or more']"));
		Discount.click();
		
		WebElement Availability = edriver.findElement(By.xpath("//span[.='Include Out of Stock']"));
		Availability.click();
	}

}
