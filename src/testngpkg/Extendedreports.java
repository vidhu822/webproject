package testngpkg;

//import java.io.File;
import java.io.IOException;

    //import org.openqa.selenium.OutputType;
    //import org.openqa.selenium.TakesScreenshot;
    //import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    //import org.openqa.selenium.io.FileHandler;
    import org.testng.Assert;
    import org.testng.ITestResult;
    import org.testng.annotations.AfterMethod;
    import org.testng.annotations.AfterTest;
    import org.testng.annotations.BeforeMethod;
    import org.testng.annotations.BeforeTest;
    import org.testng.annotations.Test;

    import com.aventstack.extentreports.ExtentReports;
    import com.aventstack.extentreports.ExtentTest;
    import com.aventstack.extentreports.Status;
    import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
    import com.aventstack.extentreports.reporter.configuration.Theme;

    
    
public class Extendedreports {
	
	WebDriver driver;
	String baseurl= "https://www.facebook.com";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void beforetest()
	{
		reporter= new ExtentHtmlReporter("./Reports/myreport.html");
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("functional test");
		reporter.config().setTheme(Theme.STANDARD);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "window10");
		extent.setSystemInfo("testername", "abc");
		extent.setSystemInfo("Browsername", "chrome");
		driver= new ChromeDriver();
	}
	
	
	@BeforeMethod
	public void setup()
	{
	driver.get(baseurl);	
	}
	
	
	@Test
	public void fbtitleverification()throws IOException
	{
		test= extent.createTest("fbtitleverification");
		String Exp= "facebook";
		String actual = driver.getTitle();
		Assert.assertEquals(Exp, actual);
	}
	
		
//	@Test
//	public void fbbuttontest() throws IOException
//	{
//		test = extent.createTest("Fbbuttontest");
//		String buttontext= driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).getText();
//		Assert.assertEquals(buttontext, "register");
//	}
	
		
	@AfterTest
	public void teardown()
	{
	extent.flush();
	}
	
	
	@AfterMethod
	public void browserclose(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "test case failed is"+result.getName());
			test.log(Status.FAIL, "test case failed is"+result.getThrowable());
			
			//String screenshotpath= Extentedreports.screenshotMethod(driver,result.getName());
	    	//test.addScreenCaptureFromPath(screenshotpath);
		}
		else if ( result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is"+result.getName());
			
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case passed is"+result.getName());
		}
	}
	
	
	
	//public static String screenshotMethod(WebDriver driver,String screenshotname) throws IOException
	//{
		//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//String destination="./Screenshot/"+screenshotname +".png";
		//File finaldestination= new File(destination);
		//FileHandler.copy(src, finaldestination);
		
		//return destination;
	
    //}
  

}

