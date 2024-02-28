package selenium.program;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click 
{

	public static void main(String[] args) throws AWTException 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement rightclick = driver.findElement(By.linkText("Gmail"));
		
		Actions click = new Actions(driver);
		click.contextClick(rightclick).perform();
		
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		//r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
		
	}

}
