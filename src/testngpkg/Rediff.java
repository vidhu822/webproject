package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff {
 WebDriver driver;
 
 @BeforeTest
 public void setup()
 {
	 driver=new ChromeDriver();
 }
  
 @BeforeMethod
 public void beforemethod()
 {
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");

 }
 @Test
 public void test()
 {
	WebElement w=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
	if(w.isDisplayed())
	{
		System.out.println("logo id displayed");
	}
	else
	{
		System.out.println("logo is not displayed");
	}
 }
 
 @Test
 public void test1()
 {
	String buttontext=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
	if(buttontext.equals("check availability"))
	{
		System.out.println("text is same ");
	}
	else
	{
		System.out.println("text is not same");
	}
		
 }
 @Test
 public void test2() {
     WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
	 boolean b= checkbox.isSelected();
	 if(b)
	 {
		 System.out.println("checkbox is Selected");
	 }
	 else
	 {
		 System.out.println("checkbox is not Selected");
	 }			 
 }
 
 @Test 
 public void test3()
 {
WebElement country=	 driver.findElement(By.xpath("//*[@id=\"country\"]"));
	 Select s= new Select(country);
	 
	 List<WebElement> li=s.getOptions();
	 if(li.size()==50)
	 {
		 System.out.println("count of the country is 50");
	 }
	 else if(li.size()>=50)
	 {
		 System.out.println("count of the country is more than 50");
	 }
	 else
	 {
		 System.out.println("count of the country ="+(li.size()));
	 }
 }
	 @Test
	 public void test4()
	 {
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("sreedhu");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("abc@rediff.com");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys("sree@123");
		driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys("sree@123");
		driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")).sendKeys("sree@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("9895065089");
		
	WebElement day=	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	Select s= new Select(day);
	s.selectByVisibleText("15");
	
	WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	Select s1= new Select(month);
	s1.selectByVisibleText("NOV");
	
	WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	Select s2=new Select(year);
	s2.selectByVisibleText("1999");
	
	WebElement country=	 driver.findElement(By.xpath("//*[@id=\"country\"]"));
	 Select s4=new Select (country);
	 s4.selectByVisibleText("India");
	 
	 WebElement city=driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
	  Select s5= new Select(city);
	  s5.selectByVisibleText("Delhi");
	  
	  driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[32]/td[3]/input")).sendKeys("L4LC");
	 WebElement button= driver.findElement(By.xpath("//*[@id=\"Register\"]"));
	 
	  if(button.isDisplayed())
	  {
		  System.out.println("button is Displayed");
	  }
	  else
	  {
		  System.out.println("button is not Displayed");
	  }
	
		
	 }
 }

