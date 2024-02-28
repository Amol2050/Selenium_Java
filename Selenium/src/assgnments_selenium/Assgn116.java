
//Launch Amazon.in and Click on 1.UAE 2.UK 3.US,using partial link text.
package assgnments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Assgn116 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		
		for(int i=0; i<3; i++)
		{
			if(i==0)
			{
				driver.findElement(By.linkText("United Arab Emirates")).click();
			}
			else if(i==1)
			{
				driver.findElement(By.linkText("United kingdom")).click();
			}
			else
			{
				driver.findElement(By.linkText("United States")).click();
			}
			
			
		}
	}

}
