//Get the title of flipkart.com and save each word in an array
package assgnments_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assgn111 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		String s = driver.getTitle();
		char c1[] = s.toCharArray();
		System.out.println(c1);
	}

}
