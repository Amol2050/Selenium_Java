package selenium.program;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestion 
{

	private static final List<WebElement> WebElement = null;

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("Canon");
		
		List<WebElement> e2=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		//int count = e2.size();
		//System.out.println(count);
		e2.get(3).click();
		
	}

}
