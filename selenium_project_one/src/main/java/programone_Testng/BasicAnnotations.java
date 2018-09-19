package programone_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class BasicAnnotations {
	
	@BeforeSuite
	public void firstsuite()
	{
		System.out.println("first suite");
	}
	
	@AfterSuite
	public void lastsuite()
	{
		System.out.println("last suite");
	}
	
	@BeforeClass
	public void firstclass()
	{
		System.out.println("first class");
	}
	
    @AfterClass
    public void lastclass()
    {
    	System.out.println("last class");
    }
	
	@Test(priority=5,enabled=false                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   )
	public void testcase() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4a.04.28\\Desktop\\Webdrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	driver.close();
		System.out.println("My first test case");
	} 
	
	@Test
	public void testcase2()
	{
		System.out.println("My second test case");
	}
	
	@BeforeMethod
	public void openbrowser() {
		System.out.println("Browser launched");
	}
	                                               
	@AfterMethod
	public void closingbrowser() {
		System.out.println("browser closed");
	}
	
	

}

	

