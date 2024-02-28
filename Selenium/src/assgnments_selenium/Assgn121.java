//Launch GrowTechminds registration form,locate every element except Dropdowns and Upload file button and perform action on each element using WebElement
package assgnments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assgn121 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("fname"));
		e1.sendKeys("Amol");
		
		WebElement e2 = driver.findElement(By.id("Username"));
		e2.sendKeys("amol2050");
		
		WebElement e3 = driver.findElement(By.id("lname"));
		e3.sendKeys("Deshmukh");
		
		WebElement e4 = driver.findElement(By.id("password"));
		e4.sendKeys("amol12345");
		
		WebElement e5 = driver.findElement(By.id("Male"));
		e5.click();
		
		WebElement e6 = driver.findElement(By.id("w3review"));
		e6.sendKeys("Jalgaon");
		
		WebElement e7 = driver.findElement(By.id("Pincode"));
		e7.sendKeys("425002");
		
		WebElement e8 = driver.findElement(By.id("Agree"));
		e8.click();	
		
		
		
	}

}
