package practiceSelenium;

//import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsfb {
	ChromeDriver driver;
	
	@Before 
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	@Test
	
	public void test()
	{
		driver.findElement(By.name("email")).sendKeys("vidhu@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("sreedhu@123");
		driver.findElement(By.name("login")).click();
		
	}
//	@After
//	public void browserclose()
//	{
//		driver.quit();
//	}

}
