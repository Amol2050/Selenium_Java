package selenium.program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HowerOver_Flipkart {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement Fashion = driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		
		Actions a = new Actions(driver);
		a.moveToElement(Fashion);
		
		
		//driver.findElement(By.xpath("(//a[@class='_3490ry'])[2]")).click();
	}

}
