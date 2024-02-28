package selenium.program;

import org.openqa.selenium.edge.EdgeDriver;

public class Navigate_methods 
{

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver = new EdgeDriver();//empty browser
		driver.navigate().to("https://www.google.com");
	//driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
	}

}
