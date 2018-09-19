package Day2_Training;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import driverpack.Webdriver_class;

public class window_Handles {
	public class Testcase1 {

		WebDriver driver;
		String browser="chrome";
		

	@Test
	public void testcase2() throws InterruptedException{
		driver=Webdriver_class.getdriver(browser);
		driver.get("http://www.licindia.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"socialThings2\"]/ul/li[1]/a/img")).click();
        Set <String> s =driver.getWindowHandles();
        Iterator<String> it=s.iterator();
        String mwid=it.next();
        String t1=it.next();
        driver.switchTo().window(t1);
        Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("sudha");
        Thread.sleep(3000);
        driver.switchTo().window(mwid);
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(3000);
        driver.quit();
        		
}
	}


}
