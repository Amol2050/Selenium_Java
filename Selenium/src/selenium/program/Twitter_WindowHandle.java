package selenium.program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Twitter_WindowHandle {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://twitter.com/?lang=en");
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.xpath("//div[@class='nsm7Bb-HzV7m-LgbsSe-bN97Pc-sM5MNb oXtfBe-l4eHX']"));
		e.click();
		
		Set <String> window = driver.getWindowHandles();
		Iterator<String> a = window.iterator();
		String pid = a.next();
		String cid = a.next();
		
		driver.switchTo().window(cid);
		
		driver.findElement(By.id("identifierId")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[1]")).clear();
	}

}
