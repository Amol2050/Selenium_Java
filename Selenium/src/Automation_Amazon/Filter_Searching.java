package Automation_Amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Filter_Searching 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("camera");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		//Filters
		driver.findElement(By.xpath("//span[@class='a-expander-prompt']")).click(); //click on see more
		
		//Camera brand filter, Price, Deals & Discount
		WebElement Nikon = driver.findElement(By.xpath("//span[.='Nikon']"));
		Nikon.click();
		WebElement Min = driver.findElement(By.id("low-price"));
		Min.sendKeys("50000");
		WebElement Max = driver.findElement(By.id("high-price"));
		Max.sendKeys("200000");
		WebElement Search = driver.findElement(By.xpath("//input[@class='a-button-input']"));
		Search.click();
		WebElement Top_Brands = driver.findElement(By.xpath("//span[.='Top Brands']"));
		Top_Brands.click();
		
		WebElement Discount = driver.findElement(By.xpath("//span[.='10% Off or more']"));
		Discount.click();
		
		WebElement Availability = driver.findElement(By.xpath("//span[.='Include Out of Stock']"));
		Availability.click();
		
		
		
		
	}

}
