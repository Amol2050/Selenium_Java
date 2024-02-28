//Count the number of links we have in a web page,locate using tag name
package assgnments_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assgn126 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		List <WebElement> e =driver.findElements(By.tagName("a"));
		int count = e.size();
		System.out.println(count);
	}

}
