package assgnments_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Assgn133 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/DELL/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.id("Relegion"));		
		Select dropDown = new Select(e);
		List<WebElement> e1 = dropDown.getOptions();
		int itemCount = e1.size();

		for(int i = 0; i < itemCount; i++)
		{
		    System.out.println(e1.get(i).getText());
		}
		
	}

}
