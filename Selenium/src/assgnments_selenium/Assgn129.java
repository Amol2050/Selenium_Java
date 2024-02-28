//Handle JavaScript popup and find the title of the page after it.
package assgnments_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assgn129 {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.switchTo().alert().accept();
		System.out.println(driver.getTitle());
	}

}
