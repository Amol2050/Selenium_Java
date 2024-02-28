package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Window_popup {

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.id("Resume"));
		e1.sendKeys("C:\\Users\\DELL\\Desktop\\invoice.pdf");
	}

}
