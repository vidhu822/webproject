package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/OneDrive/Desktop/Alert.html");
		
	}
    
	@Test
	
		public void test2() throws InterruptedException
		{
	driver.findElement(By.xpath("/html/body/input[1]")).click();
	Thread.sleep(3000);
	Alert a= driver.switchTo().alert();
	String alerttext=a.getText();
	if(alerttext.equals("Hello iam an alertbox"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	a.accept();
	//a.dismiss();
	driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Vidhu");
	driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("RB");
	driver.findElement(By.xpath("/html/body/input[4]")).click();
}
}