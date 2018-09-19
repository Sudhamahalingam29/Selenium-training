package day_3_training;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import driverpack.Webdriver_class;

public class Cookies {
	public class Testcase1 {

		WebDriver driver;
		String browser="chrome";
		

	@Test
	public void addCookie() throws InterruptedException
	{
		driver=Webdriver_class.getdriver(browser);
		driver.manage().window().maximize();
		//Snaphot.test(driver, "C:\\Users\\a07208trng_b4a.04.28\\Desktop\\Screenshots\\test1.png");
	
		driver.manage().deleteAllCookies();
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        Cookie name = new Cookie("username","Password");
        driver.manage().addCookie(name);
        
        Set<Cookie> cookie_set=driver.manage().getCookies();
        
        for(Cookie temp:cookie_set)
        {
        	System.out.println("Name of the cookie: "+temp.getName()+"and its value:"+temp.getValue()+"get domain:"+temp.getDomain()
        	+"get Path: "+temp.getPath()+"and its expiry date:"+temp.getExpiry()+"cookie is secured:"+temp.isSecure());
        }
	}
}
}