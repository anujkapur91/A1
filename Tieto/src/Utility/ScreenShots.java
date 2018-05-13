package Utility;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreenShots {
	
	public static void screenshots(WebDriver driver,String stepname)
	
	{
		try {
			TakesScreenshot ts =  (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			
			FileUtils.copyFile(source, new File("./ScreenDumps/image_"+stepname+".png"));
		} catch (Exception e) 
		{
			System.out.println("Exception thrown");
		} 
		
		
		
	}

}
