import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import driverpack.Webdriver_class;

public class mouse_actions {
	public class Testcase1 {

		WebDriver driver;
		String browser="chrome";
		

	@Test
	public void testcase2() throws InterruptedException{
		driver=Webdriver_class.getdriver(browser);
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		WebElement uname=driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		Actions mouse=new Actions(driver);
		mouse.moveToElement(uname).click().keyDown(uname, Keys.CONTROL)
		.sendKeys(uname,"Sudha")
		.keyUp(uname, Keys.SHIFT)
		.doubleClick()
		.contextClick().build().perform();
		Thread.sleep(3000);
		//driver.close();
}
    public void testcase3()
    {
    	driver=Webdriver_class.getdriver(browser);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.name("qp")).sendKeys("Testing");
		driver.findElement(By.id("qsbFormBtn")).click();
		driver.findElement(By.id("exp_ddHid")).click();
		
	
    }
}}