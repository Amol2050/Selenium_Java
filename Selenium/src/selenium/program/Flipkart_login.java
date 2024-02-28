package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart_login 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//div[@class='_38VF5e'])[1]")).click();
	}

}
