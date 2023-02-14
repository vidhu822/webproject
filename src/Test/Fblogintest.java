package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Fbloginpage;

public class Fblogintest
{
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
public void testlogin()
{
	Fbloginpage ob= new Fbloginpage(driver);
	ob.setvalues("abc@gmail.com", "adcdefg");
	ob.login();
	
}}