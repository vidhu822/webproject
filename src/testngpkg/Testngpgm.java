package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngpgm {
    WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading() 
	{
		driver.get("https://www.google.com");
	}
	@Test(groups={"smoke","sanity"})
	public void titleverification()
	{
		System.out.println("hello goodmorning");
	}
	@Test(groups={"sanity"})
	public void test2()
	{
	   System.out.println("welcome");
	}
	@Test(groups={"sanity"})
	public void test3()
	{
		System.out.println("myself sree");
	}
	@Test(groups= {"regression"})
	public void test4()
	{
		//test activity
	}
	@Test(groups= {"smoke"})
	public void test5()
	{
		//test activity
	}
}
 