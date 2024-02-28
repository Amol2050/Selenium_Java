//Launch grotechminds registration form and locate dropdowns skills,country and religion perform action on them

package assgnments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assgn123 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("Skills")).click();
		
		Select sk = new Select(driver.findElement(By.id("Skills")));
		sk.selectByVisibleText("Technical Skills");
		
		Select sk1 = new Select(driver.findElement(By.id("Country")));
		sk1.selectByVisibleText("Afganistan");
		
		Select sk2 = new Select(driver.findElement(By.id("Relegion")));
		sk2.selectByVisibleText("Hindu");
		
		
		
	}

}
