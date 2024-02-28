//Launch GrowTechminds registration form,for firstname textfield enter name as Manish Kumar Tiwari,remove Tiwari from it using Keys option

package assgnments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Assgn120 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.id("fname")).sendKeys("manish kumar tiwari");
		for(int i=0; i<6;i++)
		{
			driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);

		}
		
		
		
	}

}
