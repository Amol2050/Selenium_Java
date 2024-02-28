package Automation_Amazon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Goibibo 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!RSA!108599293!6504095653!617695092667!e!goibibo!c!&gad_source=1&gclid=CjwKCAiAq4KuBhA6EiwArMAw1Ae_4SgvV2GetCbtDrXN7UVRddYGi13uYxg251gJhF8IaU6oEJOp1BoC5aIQAvD_BwE");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().refresh();
		
		WebElement From = driver.findElement(By.xpath("(//div[@class='sc-12foipm-16 wRKJm fswFld '])[1]"));
		From.click();
		WebElement crnt_location = driver.findElement(By.xpath("//div[@class='sc-12foipm-34 iHoHRr']//input[@type='text']"));
		crnt_location.sendKeys("Pune");
		WebElement Pune = driver.findElement(By.xpath("//li[@tabindex='0']"));
		Pune.click();
		
		WebElement dest = driver.findElement(By.xpath("//div[@class='sc-12foipm-34 iHoHRr']//div[@class='sc-12foipm-38 dAUhfz']//input[@type='text']"));
		dest.sendKeys("Banglore");
		WebElement Banglore = driver.findElement(By.xpath("//li[@tabindex='0']"));
		Banglore.click();
		
		
		
		WebElement Departure = driver.findElement(By.xpath("(//div[@class='sc-12foipm-30 cYbSgs']/div/div)[3]"));
		Departure.click();
		
		WebElement Dep_date = driver.findElement(By.xpath("//div[@class='DayPicker-Day']//p[.='15']"));
		Dep_date.click();
		WebElement done = driver.findElement(By.xpath("//span[.='Done']"));
		done.click();
		
		WebElement child = driver.findElement(By.xpath("(//span[@class='sc-12foipm-64 dGRyPm'])[4]"));
		child.click();	
		
		WebElement Economy = driver.findElement(By.xpath("//li[.='premium economy']"));
		Economy.click();
		
		WebElement done1 = driver.findElement(By.xpath("//a[.='Done']"));
		done1.click();
		
		WebElement Search = driver.findElement(By.xpath("//span[.='SEARCH FLIGHTS']"));
		Search.click();
		
		WebElement Return = driver.findElement(By.xpath("(//input[@placeholder='Travel Dates'])[2]"));
		Return.click();
		
		WebElement Return_date = driver.findElement(By.xpath("(//div[@class='dcalendarstyles__DayAndDateWrapperDiv-sc-r2jz2t-5 gUCxnE']//ul[@class='dcalendarstyles__DateWrapDiv-sc-r2jz2t-7 gvwEie']//li)[25]"));
		Return_date.click();
		
		WebElement Update_Search = driver.findElement(By.xpath("//button[.='UPDATE SEARCH']"));
		Update_Search.click();
		
		
		/*List<WebElement> Dates = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]"));
		int Date_count = Dates.size();
		
		for(int i=0;i<Date_count;i++)
		{
			
			
		}*/
	}

}
