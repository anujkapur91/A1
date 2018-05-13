/**
 * 
 */
package pOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Anuj Kapur
 *
 */
public class loginpage {

	WebDriver driver;
	
	By username =By.xpath(".//*[@id='user_login']");
	By password =By.xpath(".//*[@id='user_pass']");
	By submit =By.xpath(".//*[@id='wp-submit']");

	
	public loginpage(WebDriver driver)
	
	{
		this.driver= driver;
	}

	

	public void login_fn(String uid, String pass) {
		driver.findElement(username).sendKeys(uid);
		driver.findElement(password).sendKeys(pass);	
		driver.findElement(submit).click();
		
	}
	
}
