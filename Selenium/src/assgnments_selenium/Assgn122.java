//Launch GrowTechminds registration form,Enter "Manish Kumar Tiwari" in the firstname and copy paste in all 4 text fields using keys

package assgnments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assgn122 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.id("fname")).sendKeys("Manish kumar Tiwari");
		driver.findElement(By.id("fname")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("fname")).sendKeys(Keys.CONTROL+"c");
		
		driver.findElement(By.id("lname")).sendKeys(Keys.CONTROL+"v");
		
		driver.findElement(By.id("Username")).sendKeys(Keys.CONTROL+"v");
		
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"v");
		
		
	}

}
