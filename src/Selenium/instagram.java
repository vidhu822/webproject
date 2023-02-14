package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {
ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
    
	@Test
	
		public void test()
		{
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("email")).sendKeys("rinuvava@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("rinuvava");
		driver.findElement(By.name("login")).click();		}
	
}