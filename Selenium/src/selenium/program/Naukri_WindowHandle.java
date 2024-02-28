package selenium.program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_WindowHandle 
{


		public static void main(String[] args) throws InterruptedException 
		{
			ChromeDriver driver= new ChromeDriver();
			driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
			driver.manage().window().maximize();
		WebElement google_link=	driver.findElement(By.xpath("//span[.='Google']"));
		google_link.click();
		String parentid=		driver.getWindowHandle();
		Set<String> parentandchild=	driver.getWindowHandles();
		System.out.println(parentid);
		System.out.println(parentandchild);
		Thread.sleep(2000);
		
		Iterator<String> pcid=parentandchild.iterator();
		String parentid1=	pcid.next();//parent id from parentandchild
		String childid1=pcid.next();//1st childid
		
		System.out.println(parentid1);
		System.out.println(childid1);
		
		
		driver.switchTo().window(childid1);//moved the control to child window
		Thread.sleep(3000);
		driver.close();

//		WebElement username=	driver.findElement(By.id("identifierId"));
//		username.sendKeys("stbymkt@gmail.com");
		}

	}

