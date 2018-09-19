import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import driverpack.Webdriver_class;

public class mouse_hover {

		public class Testcase1 {

			WebDriver driver;
			String browser="chrome";
			

		@Test
		public void testcase2() throws InterruptedException{
			driver=Webdriver_class.getdriver(browser);
			driver.get("https://www.drikpanchang.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			WebElement panchang=driver.findElement(By.xpath("//*[@id=\"dpMenuId\"]/li[3]/a"));
			Actions mouse=new Actions(driver);
			mouse.moveToElement(panchang).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"dpMenuId\"]/li[3]/div[2]/div[2]/a[4]")).click();
		Thread.sleep(3000);
		driver.close();
		}
		}		
}
