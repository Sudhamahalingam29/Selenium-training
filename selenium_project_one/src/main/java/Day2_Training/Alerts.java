package Day2_Training;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import driverpack.Webdriver_class;

public class Alerts {

	public class Testcase1 {

		WebDriver driver;
		String browser="chrome";
		

	@Test
	public void testcase2() throws InterruptedException, IOException{
		driver=Webdriver_class.getdriver(browser);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		Snaphot.test(driver, "C:\\Users\\a07208trng_b4a.04.28\\Desktop\\Screenshots\\test1.png");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	driver.findElement(By.name("proceed")).click();
	Alert a=driver.switchTo().alert();
	Thread.sleep(2000);
	Snaphot.test(driver, "C:\\Users\\a07208trng_b4a.04.28\\Desktop\\Screenshots\\test2.png");
	a.dismiss();
	Thread.sleep(2000);
	Snaphot.test(driver, "C:\\Users\\a07208trng_b4a.04.28\\Desktop\\Screenshots\\test3.png");
	driver.findElement(By.id("login1")).sendKeys("sudha");
	Snaphot.test(driver, "C:\\Users\\a07208trng_b4a.04.28\\Desktop\\Screenshots\\test4.png");
	Thread.sleep(2000);
	driver.close();
	}

	}
	
}
