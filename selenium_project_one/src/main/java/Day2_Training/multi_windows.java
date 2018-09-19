package Day2_Training;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import driverpack.Webdriver_class;

public class multi_windows {
	public class Testcase1 {

		WebDriver driver;
		String browser="chrome";
		

	@Test
	public void testcase2() throws InterruptedException{
		driver=Webdriver_class.getdriver(browser);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		String mwid=driver.getWindowHandle();
	    Set<String> allwinds=driver.getWindowHandles();
	    for(String x:allwinds)
	    {
	    	if(!x.equals(mwid))
	    	{
	    		driver.switchTo().window(x);
	    		driver.close();
	    		Thread.sleep(2000);
	    	}
	    }
driver.switchTo().window(mwid);
Thread.sleep(2000);
driver.close();
	    
}
	}
}