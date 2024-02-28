//Test searching for the product by its name like shoes
package Automation_Amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Search_Product 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Adidas Basic Sneakers");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		
	}

}
