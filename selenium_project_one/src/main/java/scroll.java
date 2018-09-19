import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import driverpack.Webdriver_class;

public class scroll {
	public class Testcase1 {

		WebDriver driver;
		String browser="chrome";
		

	@Test
	public void testcase2() throws InterruptedException{
		driver=Webdriver_class.getdriver(browser);
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		WebElement src=driver.findElement(By.cssSelector("#treebox1 > div > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr:nth-child(1) > td.dhxTextCell.standartTreeRow"));
	    WebElement dest=driver.findElement(By.cssSelector("#treebox2 > div > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr.selectedTreeRowFull > td.dhxTextCell.standartTreeRow"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		Actions mouse=new Actions(driver);
		mouse.dragAndDrop(src, dest).perform();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(1000,0)");
	   WebElement webpage=driver.findElement(By.cssSelector("body > div > header > div.dhx-container > div > div > div.header-content.header-content--suite-product > div > div:nth-child(1) > a"));
	   mouse.contextClick(webpage).perform();
	   Thread.sleep(3000);
		//driver.close();
}
}
}