package selenium.program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Demo 
{
	@Test
	public void Myntra()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Search = driver.findElement(By.name("q"));
		String Title = driver.getTitle();
		//Assert.assertEquals(Search.isDisplayed(), true); //
		//Assert.assertEquals(true , true);
		//Assert.assertEquals(true, false);
		
		
		Assert.assertEquals(Title,"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}

}
