//Launch amazon india search for shoes,select 30th shoe and add it to the cart inspect shoes using xpath

package assgnments_selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assgn128 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement e =driver.findElement(By.id("twotabsearchtextbox"));
		e.sendKeys("shoes");
		e.sendKeys(Keys.ENTER);
		
		List<WebElement> Shoes = driver.findElements(By.xpath("//span[@class='rush-component s-latency-cf-section']/div/div"));
		int shoe_count = Shoes.size();
		System.out.println(shoe_count);
		
		Shoes.get(30).click();
		
		Set <String> pid_cid = driver.getWindowHandles();
		Iterator<String> count = pid_cid.iterator();
		String pid =count.next();
		String cid = count.next();
		
		driver.switchTo().window(cid);
		WebElement Add_Cart = driver.findElement(By.id("add-to-cart-button"));
		Add_Cart.click();
		
	}

}
