//1.Test if New User can successfully register

package Automation_Amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class User_Register 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		driver.manage().window().maximize();
		
		
		WebElement First_Name = driver.findElement(By.id("fname"));
		First_Name.sendKeys("Amol");
		
		WebElement Last_Name = driver.findElement(By.id("lname"));
		Last_Name.sendKeys("Deshmukh");
		
		WebElement User_Name = driver.findElement(By.id("Username"));
		User_Name.sendKeys("amol2050");
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Ad@#$2024");
		
		WebElement Gender = driver.findElement(By.id("Male"));
		Gender.click();
		
		WebElement skills = driver.findElement(By.id("Skills"));
		Select skills_list = new Select(skills);
		skills_list.selectByIndex(1);
		
		WebElement lang = driver.findElement(By.xpath("//select[@class='technicalskills c-s ss']"));
		Select lang_list = new Select(lang);
		lang_list.selectByIndex(1);	
		
		WebElement Country = driver.findElement(By.id("Country"));
		Select Country_list = new Select(Country);
		Country_list.selectByIndex(8);
		
		WebElement Present_Addr = driver.findElement(By.id("w3review"));
		Present_Addr.sendKeys("Pune");
		
		WebElement Permenant_Addr = driver.findElement(By.id("Address"));
		Permenant_Addr.sendKeys("Pune");
		
		WebElement Pincode = driver.findElement(By.id("Pincode"));
		Pincode.sendKeys("411001");
		
		WebElement Relegion = driver.findElement(By.id("Relegion"));
		Select Hindu = new Select(Relegion);
		Hindu.selectByIndex(1);
		
		driver.findElement(By.id("Resume")).sendKeys("C:\\Users\\DELL\\Desktop\\invoice.pdf");
		driver.findElement(By.id("Agree")).click();
		
		WebElement Submit = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		Submit.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
