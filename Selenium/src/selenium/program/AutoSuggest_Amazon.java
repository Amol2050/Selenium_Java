package selenium.program;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggest_Amazon 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement e =driver.findElement(By.id("twotabsearchtextbox"));
		e.sendKeys("mouse");
		//driver.findElement(By.xpath("(//form/ul/li)[3]")).click();
		
		List<WebElement> cam = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		
		int no = cam.size();
		System.out.println(no);
		cam.get(4).click();
		
	}

}
