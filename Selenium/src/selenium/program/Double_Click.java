package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement a =driver.findElement(By.linkText("Mobiles"));
		Actions Dclick = new Actions(driver);
		Dclick.doubleClick(a).perform();
	}

}
