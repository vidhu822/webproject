package practiceSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
				driver.get("https://www.google.com");
			String pagesrc=	driver.getPageSource();
			if(pagesrc.contains("Images"))
			{
				System.out.println("text is present");
			}
			else
			{
				System.out.println("text is not present");
			}
	}
}