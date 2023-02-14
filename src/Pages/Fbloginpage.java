package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {


		WebDriver driver;
		
		By fbemail=By.id("email");
		By fbpassword= By.id("pass");
		By fblogin= By.name("login");
		
		public Fbloginpage(WebDriver driver)
		{
			this.driver= driver;
		}
		
		public void setvalues(String email,String password)
		{
			driver.findElement(fbemail).sendKeys(email);
			driver.findElement(fbpassword).sendKeys(password);
		}
		
		public void login()
		{
			driver.findElement(fblogin).click();
		}
	}

