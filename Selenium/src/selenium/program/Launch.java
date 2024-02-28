package selenium.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://www.amazon.in");
		c1.manage().window().maximize();
		WebElement t1=	c1.findElement(By.id("twotabsearchtextbox"));
		t1.sendKeys("mouse");
		Thread.sleep(4000);
		List<WebElement> t2=	c1.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		t2.get(t2.size()-6).click(); //6th component
		
		
		
		
	}

}
