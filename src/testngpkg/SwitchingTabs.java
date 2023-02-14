package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwitchingTabs {

	 WebDriver driver;
	  
	  @BeforeTest
	  public void setup() {
		  driver=new ChromeDriver();	  
	  }
	  
	  @Test
	  public void test1()
	  {
		  driver.get("https://demo.guru99.com/popup.php");
		  driver.manage().window().maximize();
		  String parentwindow =driver.getWindowHandle();
		  
		  System.out.println("Parent Window Title"+driver.getTitle());
		  driver.findElement(By.xpath("/html/body/p/a")).click();
		  
		  
		  Set<String> allWindowHandles= driver.getWindowHandles();
		  
		  for(String handle:allWindowHandles)
		  {
			  System.out.println(handle);
		    if(!handle.equalsIgnoreCase(parentwindow))
		    {
		    	driver.switchTo().window(handle);
		        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@gmail.com");
		        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();	       
		        driver.close();
		    	
		    }
		  driver.switchTo().window(parentwindow);
	  }
 
}}
