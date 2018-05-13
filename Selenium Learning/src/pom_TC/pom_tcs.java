/**
 * 
 */
package pom_TC;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser_selection.browser;
import excell.excellconfig;
import pOM.dashboardpage;
import pOM.loginpage;
/**
 * @author Anuj Kapur
 *
 */
public class pom_tcs {
	
	
	
	@Test(priority=1, dataProvider="login")	
	
	//@Parameters({"browser_name","url"})
	public void validate_login(String username, String password) throws InterruptedException
	{
		

		String bn = "ffb";
		WebDriver driver = browser.select_Browser(bn);
		
		
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		loginpage login = new loginpage(driver);
		
		
		login.login_fn(username, password);
		String actual_page_url = driver.getCurrentUrl();
		
		String expected = "http://demosite.center/wordpress/wp-admin/";
		
		WebDriverWait wait = new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.urlContains(expected));
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@id='wpbody-content']/div[4]/h2")));

		System.out.println(actual_page_url);
		//Assert.assertEquals(actual_page_url, expected);
		driver.quit();
	}
	
	@Parameters({"browser_name","url"})
	@Test
	
	public void print(String browser_name, String url)
	{
		System.out.println(browser_name);

		System.out.println(url);
	}
	@Test(priority=2)	
	@Parameters({"browser_name","url"})
	public void post(String bn, String url) 
	
	{

		WebDriver driver = browser.select_Browser(bn);
		driver.manage().window().maximize();
		driver.get(url);
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		loginpage login = new loginpage(driver);
		String uid= "Admin";
		String pass = "demo123";
		login.login_fn(uid, pass);
		String actual_page_url = driver.getCurrentUrl();
		
		String expected = "demosite.center/wordpress/wp-admin/";
		
	//Thread.sleep(3000);
	
	
		 if (actual_page_url.contains(expected));
		 {
			dashboardpage dashbrd= new dashboardpage(driver);
			
			String act= "post";
			
			dashbrd.dash_home_panel(act);
			
		 }
		 
			 
			 
		 
		 driver.quit();
		
		
	}

	@DataProvider(name="login")
	public Object[][] logindata() throws Exception
	{
		String Path="C:/Excell.xlsx";
		String Sheet="Test";
		Object[][] arrayobj = excellconfig.readfromexcel(Path, Sheet);
				return arrayobj;
				} 

	
		
}
