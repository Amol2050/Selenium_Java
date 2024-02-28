package selenium.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Print_URLs {

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		List <WebElement> e =driver.findElements(By.tagName("div"));
		int count = e.size();
		System.out.println(count);
		
		for(int i =0; i<e.size()-1;i++)
		{
			//System.out.println("Links are"+ e.get(i).getText());
			System.out.println("Links are"+ e.get(i).getAttribute("title"));
			
		}
	}

}
