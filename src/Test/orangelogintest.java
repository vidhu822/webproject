package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Orangeloginpage;


public class orangelogintest {
	WebDriver driver;
	String baseurl= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

@BeforeTest
public void setup()
{
	driver= new ChromeDriver();
}

@BeforeMethod
public void url()
{
	driver.get(baseurl);
}

@Test
public void testlogin()
{
	Orangeloginpage ob= new Orangeloginpage(driver);
	ob.setvalues("vidhu", "vidhu123");
	ob.login();
	
}}

