package Selenium;



import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm {

	WebDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/OneDrive/Desktop/Alert.html");
	}
	@Test
	public void test() throws IOException
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("E://error.png"));
		WebElement button=driver.findElement(By.xpath("/html/body/input[1]"));
		File sc=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("./screenshot/error1.png"));
	}
}
