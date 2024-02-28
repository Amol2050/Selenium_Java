//Login to facebook.com - write email and copy paste same in password
package assgnments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgn118 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("pass")).sendKeys(Keys.DELETE);
		
	}

}
