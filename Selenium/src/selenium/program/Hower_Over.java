package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hower_Over {

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.xpath("//a[@title='Search Jobs']"));
		Actions a = new Actions(driver);
		a.moveToElement(e1).perform();
		
		driver.findElement(By.linkText("IT jobs")).click();
	}

}
