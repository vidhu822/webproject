package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Orgpassworderrorpage {
	WebDriver driver;
	By forgottenlink= By.xpath("//*[contains(text(),'Forgot your password ')]");
	By forgottenpasswordmobile =By.id("identify_Username");
	By forgottenpasswordsearch= By.id("did_submit");
	
	public void linkclick()
	{
		driver.findElement(forgottenlink).click();
		
	}
	
	public  Orgpassworderrorpage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void setvalues(String mobilenumber)
	{
		driver.findElement(forgottenpasswordmobile).sendKeys(mobilenumber);
	}
	public void click()
	{
		driver.findElement(forgottenpasswordsearch).click();
	}
}

