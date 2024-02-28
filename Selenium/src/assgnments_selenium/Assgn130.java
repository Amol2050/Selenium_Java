package assgnments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assgn130 {

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		
		//WebElement e = driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])[1]"));
		WebElement e= driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		e.click();
		driver.findElement(By.id("username")).sendKeys("amol");
		driver.findElement(By.id("label2")).sendKeys("abc123");
		driver.findElement(By.id("loginCaptchaValue")).sendKeys("f48r3");
		driver.findElement(By.id("Button2")).click();
	}

}
