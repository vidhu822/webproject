package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ksrtcloginpage {

	WebDriver driver;
	
    By ksrtcusername=By.id("UserName");
	By ksrtcpassword= By.id("pass");
	By ksrtclogin= By.name("login");
	
	public Ksrtcloginpage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void setvalues(String UserName,String password)
	{
		driver.findElement(ksrtcusername).sendKeys(UserName);
		driver.findElement(ksrtcpassword).sendKeys(password);
	}
	
	public void login()
	{
		driver.findElement(ksrtclogin).click();
	}
}


