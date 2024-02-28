//launch amazon.in select category dropdown,select Books using arrow down key then search for software in search text field and press enter using keys function.

package assgnments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Assgn119 {

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//select[@name=\"url\"]")).click();
		for (int i=0; i<11; i++)
		{
			driver.findElement(By.xpath("//select[@name=\"url\"]")).sendKeys(Keys.ARROW_DOWN);
		
		}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("software");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
	}

}
