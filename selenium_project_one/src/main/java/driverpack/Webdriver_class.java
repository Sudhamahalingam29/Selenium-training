package driverpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Webdriver_class {
	
	public static WebDriver getdriver(String browser)
	{
	
	if(browser.equalsIgnoreCase("chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4a.04.28\\Desktop\\Webdrivers\\chromedriver.exe");
	return new ChromeDriver();
	}
	
	else if(browser.equalsIgnoreCase("mozilla"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\a07208trng_b4a.04.28\\Desktop\\Webdrivers\\geckodriver.exe");
		return new FirefoxDriver();
	}
	
	else if(browser.equalsIgnoreCase("ie"))
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\a07208trng_b4a.04.28\\Desktop\\Webdrivers\\IEDriverServer.exe");
	return new InternetExplorerDriver();
	}
	else
	{
		System.out.println("Browser invalid");
		return null;
	}
}
}

	