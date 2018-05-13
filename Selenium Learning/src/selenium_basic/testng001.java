package selenium_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class testng001 {
	
@Test 

public void tc1()
	{
	System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url,"https://www.google.co.in/");
	}
@Test 	
public void tc2()
	{
	System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.linkedin.com/");
		String url = driver1.getCurrentUrl();
		Assert.assertEquals(url,"https://www.google.co.in/");
	}

}
