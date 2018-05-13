package pOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class dashboardpage {
	
	WebDriver driver;
	
	By post = By.xpath(".//*[@id='menu-posts']/a");
	By media = By.xpath(".//*[@id='menu-media']/a");
	By addpost = By.xpath(".//*[@id='menu-posts']/div[3]/div/ul/li[2]/a");
	

	public dashboardpage(WebDriver driver)
	{
		this.driver = driver;
		
		
	}
	
	public void dash_home_panel(String action)
	
	{
		if (action.equalsIgnoreCase("post"))
		{
			WebElement postelement = driver.findElement(post);
			
			Actions act= new Actions(driver);
			
			act.moveToElement(postelement).perform();
			
			driver.findElement(post).click();
			driver.findElement(addpost).click();
			
			
			
		}
		else if (action.equalsIgnoreCase("media"));
		{
			
		}
			
	}
	
	
}
