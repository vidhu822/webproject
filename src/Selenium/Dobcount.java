package Selenium;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dobcount {
WebDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
    
	@Test
	public void test() {
	WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	Select s= new Select(day);
	s.selectByVisibleText("01");
	List<WebElement> l=s.getOptions();
	System.out.println(l.size());
	
	WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	Select s1= new Select(month);
	s1.selectByVisibleText("MAR");
	List<WebElement> l1=s1.getOptions();
	System.out.println(l1.size());

		
	WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	Select s2=new Select(year);
	s2.selectByVisibleText("2000");
	List<WebElement> l2=s2.getOptions();
	System.out.println(l2.size());

	}
}