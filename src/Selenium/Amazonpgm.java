package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpgm {
ChromeDriver driver;
	
	@Before
	
		public void setup()
		{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		}
	@Test
	public void test()
	{
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[4]")).click();
		driver.findElement(By.xpath("//*[@id='nav-cart']")).click();
		driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//*[@id='continue']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']")).click();
		
	}
}