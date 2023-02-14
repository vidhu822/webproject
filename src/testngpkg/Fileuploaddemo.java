package testngpkg;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Fileuploaddemo {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		driver= new ChromeDriver();
	
	}
	@Test
	public void test()
	{
		driver.get("https://demo.guru99.com/test/upload/");
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		
	}
}
