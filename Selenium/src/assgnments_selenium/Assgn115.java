
//Launch Google.com and click on gmail using linkText.
package assgnments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Assgn115 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.linkText("Gmail")).click();
	}

}
