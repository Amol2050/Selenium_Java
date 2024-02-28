//Perform any action on the disabled component and find out which exceeption we are getting

package assgnments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assgn125 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/DELL/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement e =driver.findElement(By.name("lname"));
		Boolean disp =e.isDisplayed();
		System.out.println(disp);
		Boolean enb = e.isEnabled();
		System.out.println(enb);
		e.sendKeys("Amol"); // element not interactable exception
	}

}
