package selenium.program;

import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart_auto 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
	}

}
