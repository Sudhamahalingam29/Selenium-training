package driverpack;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RoughTest {

	WebDriver driver;
	String browser="ie";
	
	@BeforeMethod
	public void openbrowser(){
		driver=Webdriver_class.getdriver(browser);
		driver.get("http://www.google.com");
	}
	@Test
	public void test(){
		System.out.println("This is my tsetcase");
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	
}
