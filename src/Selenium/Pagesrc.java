package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesrc {

	public static void main(String[] args) {
   ChromeDriver driver = new ChromeDriver();
   driver.get("https://www.google.com");
   String src=driver.getPageSource();
   if (src.contains("Gmail"))
   {
	   System.out.println("text is present");
   }
   else
   {
	   System.out.println("text is not present");
   }
   }

}
