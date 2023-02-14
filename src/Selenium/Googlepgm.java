package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlepgm {
ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
    
	@Test
	
		public void test2()
		{
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("mobiles",Keys.ENTER);
}
}