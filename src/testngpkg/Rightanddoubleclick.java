package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rightanddoubleclick {

	 WebDriver driver;
	  
	  @BeforeTest
	  public void setup() {
		  driver=new ChromeDriver();
		  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		  
	  }
	  
	  @Test
	  public void test1() throws InterruptedException
	  
	  {
		  
	
		  WebElement rightclick= driver.findElement(By.xpath("//*[@id=\"authentication\"]/span")); 
		  Actions act=new Actions(driver);
		  act.contextClick(rightclick);
		  act.perform();
		  driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
		  Alert a= driver.switchTo().alert();
		  String text=a.getText();
		  //Thread.sleep(3000);
	      if(text.equalsIgnoreCase("clicked:edit"))
	      {
	    	  System.out.println("pass");
	      }
	      else
	      {
	    	  System.out.println("fail");
	      }
		a.accept();
		
	  }
	  
	  @Test
	  public void test2() throws InterruptedException
	  {
		  WebElement doubleclick= driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		  Actions act=new Actions(driver);
		  act.doubleClick(doubleclick);
		  act.perform();
		  Thread.sleep(3000);
		  Alert a= driver.switchTo().alert();
		  String s=a.getText();
		  
	  if(s.equalsIgnoreCase("you double clicked me.. Thank You.."))
		 {
	  System.out.println("is correct");
	}      
     else
	 {
	 System.out.println("is not correct");
	 }
		  a.accept();
		
		 
	  }
		  
	  
}
