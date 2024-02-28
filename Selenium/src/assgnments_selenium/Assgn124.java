//Launch Growtechminds xpath form do the folllowing  1. Write an Xpath for books
//2. Write an Xpath for Mobiles
//3. Write an Xpath for Clothes
//4. Write an Xpath for Chocolates

package assgnments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Assgn124 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://grotechminds.com/x-path/#1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class=\"folder\"]")).click();
		driver.findElement(By.xpath("//span[@class=\"folder\"]")).click();
		
		
	}

}
