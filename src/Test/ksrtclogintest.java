package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Ksrtcloginpage;

public class ksrtclogintest {
	WebDriver driver;
	String baseurl= "https://ksrtc.in/oprs-web/login/show.do";

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
	Ksrtcloginpage ob= new Ksrtcloginpage(driver);
	ob.setvalues("abcdefgh", "adcdefg");
	ob.login();
	
}}

