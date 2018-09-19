package Day2_Training;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

import driverpack.Webdriver_class;

public class robot {
	public class Testcase1 {

		WebDriver driver;
		String browser="chrome";
		

	@Test
	public void testcase2() throws InterruptedException, AWTException{
		driver=Webdriver_class.getdriver(browser);
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Actions mouse=new Actions(driver);
		WebElement fp=driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/content/div/div/a"));
		mouse.moveToElement(fp).contextClick().perform();
		
		Robot win=new Robot();
		win.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		win.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		win.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

//		public void testcase3()
//		{
//			
}
}
}