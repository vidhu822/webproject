package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Orangeloginpage {

	

	WebDriver driver;
	
	By orgUsername=By.id("username");
	By orgpassword= By.id("pass");
	By orglogin= By.name("login");
	
	public Orangeloginpage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void setvalues(String Username,String password)
	{

	  
		driver.findElement(orgUsername).sendKeys(Username);
		driver.findElement(orgpassword).sendKeys(password);
	}
	
	public void login()
	{
		driver.findElement(orglogin).click();
	}
}



