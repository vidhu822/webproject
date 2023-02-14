package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Passworderrorpage;

public class Passworderrortest {

	WebDriver driver;
	String baseurl= "https://www.facebook.com";

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
public void testforgottenpassword()
{
	Passworderrorpage ob = new Passworderrorpage(driver);
	ob.linkclick();
	ob.setvalues("123456789");
	ob.click();
	
}
}
