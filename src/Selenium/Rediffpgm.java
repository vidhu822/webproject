package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffpgm {
ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
    
	@Test
	
		public void test2() throws InterruptedException
		{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@value=\"m\"]")).isSelected();
		driver.findElement(By.xpath("//*[@value=\"f\"]")).isSelected();
		}
}