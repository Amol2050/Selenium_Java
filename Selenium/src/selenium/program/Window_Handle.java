package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Window_Handle 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[.='Login']")).click();
		
		
		
		
	}

}
