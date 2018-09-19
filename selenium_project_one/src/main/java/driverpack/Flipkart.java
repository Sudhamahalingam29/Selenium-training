package driverpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Flipkart {

	public class Testcase1 {

		WebDriver driver;
		String browser="chrome";
		
		@Test
		public void openbrowser() throws InterruptedException{
			driver=Webdriver_class.getdriver(browser);
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
			WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[2]/form/div/div[1]/div/input"));
			WebElement searchbutton=driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[2]/form/div/div[2]/button"));
			
			searchbox.sendKeys("iPhone");
			Thread.sleep(2000);
			searchbutton.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[2]/div/div[1]/div[2]/div[26]/div/nav/a[7]")).click();
			
			Thread.sleep(4000);
			driver.navigate().back();
			searchbox.clear();
			searchbox.sendKeys("Redmi case");
			searchbutton.click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().forward();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			driver.close();
		}
}
}