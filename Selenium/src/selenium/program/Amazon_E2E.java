package selenium.program;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_E2E 
{
	@Test
	public void loginToAmazon()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement e = driver.findElement(By.id("nav-link-accountList"));
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		
		WebElement e1 = driver.findElement(By.linkText("Sign in"));
		e1.click();
		driver.findElement(By.id("ap_email")).sendKeys("9970398616");
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("Ad@#$2023");
		driver.findElement(By.id("signInSubmit")).click();
		//We are performing assertions on serach text field
		
		WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
		
		
		//Assert.assertEquals(Search.isDisplayed(), false);
		//Assert.assertEquals(Search.isDisplayed(), false, "Sorry! Element not Found.");
	//	Assert.assertTrue(Search.isDisplayed()==false);
	//	Assert.assertTrue(Search.isDisplayed()==false, "Sorry the given component was not found");
		
	//	Assert.assertFalse(false);
		Assert.assertFalse(false, "Sorry ");
		
		
	/*	Search.sendKeys("Books on india");
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
		//Thread.sleep(2000);
		WebElement Proceed_Buy = driver.findElement(By.id("sc-buy-box-ptc-button"));
		Proceed_Buy.click();
		
		//driver.findElement(By.xpath("(//input[@class='a-button-input'])[4]")).click();
		
		WebElement Use_Address = driver.findElement(By.id("shipToThisAddressButton"));
		Use_Address.click();
		
		//Thread.sleep(5000); 
		WebElement Select_Debit = driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']"));
		Select_Debit.click();	
	
		
		//Thread.sleep(2000);
		WebElement Card_Details = driver.findElement(By.linkText("Enter card details"));
		Card_Details.click();
		
		WebElement First_frame =driver.findElement(By.name("ApxSecureIframe"));
		driver.switchTo().frame(First_frame);
		
		
		WebElement Card_no = driver.findElement(By.name("addCreditCardNumber"));
		Card_no.sendKeys("987654324");*/
		
		
		
	}

}
