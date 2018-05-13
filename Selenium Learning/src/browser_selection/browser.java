package browser_selection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browser {
	
	static WebDriver driver;
	
	

	public static WebDriver select_Browser(String browsername) 
	{
		// TODO Auto-generated method stub
		if (browsername.equalsIgnoreCase("ffb"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.17.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
	    }
		else if (browsername.equalsIgnoreCase("cb"))
		{
		System.setProperty("webdriver.chrome.driver", "‪E:\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("ieb"));
		{
		System.setProperty("webdriver.ie.driver", "‪E:\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		}
	
	return driver;
	}
}


