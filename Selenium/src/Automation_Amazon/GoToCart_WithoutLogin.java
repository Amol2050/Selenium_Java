package Automation_Amazon;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoToCart_WithoutLogin 
{
	@Test
	public void GoToCart()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		driver.manage().window().maximize();
		
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
		
		WebElement Goto_Cart = driver.findElement(By.xpath("(//a[@class='a-button-text'])[3]"));
		Goto_Cart.click();
	}

}
