package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Passworderrorpage {

	WebDriver driver;
	By forgottenlink= By.xpath("//*[contains(text(),'Forgotten password')]");
	By forgottenpasswordmobile =By.id("identify_email");
	By forgottenpasswordsearch= By.id("did_submit");
	
	public void linkclick()
	{
		driver.findElement(forgottenlink).click();
		
	}
	
	public Passworderrorpage(WebDriver driver)
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
