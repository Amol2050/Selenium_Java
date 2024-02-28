package selenium.program;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest_Myntra 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement SearchBar = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		SearchBar.sendKeys("jeans");
		
		List<WebElement> Jeans = driver.findElements(By.xpath(" //div[@class=' desktop-autoSuggest desktop-showContent']/ul/li"));
		int size = Jeans.size();
		System.out.println(size);
		Jeans.get(size-9).click();
	}

}
