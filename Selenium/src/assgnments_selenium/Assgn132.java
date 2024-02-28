package assgnments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
	
public class Assgn132 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drag = driver.findElement(By.id("drag7"));
		WebElement drop = driver.findElement(By.id("div2"));
		
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		a1.dragAndDrop(drop, drag).perform();
	}

}
