//Launch Amazon and click on mobile tab.

package assgnments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Assgn114 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.linkText("Mobiles")).click();
	}

}
