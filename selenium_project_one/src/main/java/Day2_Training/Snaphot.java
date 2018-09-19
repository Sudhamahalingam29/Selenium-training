package Day2_Training;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Snaphot {

	public static void test(WebDriver driver,String filepath) throws IOException
	{
	TakesScreenshot ss=((TakesScreenshot)driver);
	File src=ss.getScreenshotAs(OutputType.FILE);
	
	File dest=new File(filepath);
	FileUtils.copyFile(src, dest);
}
}