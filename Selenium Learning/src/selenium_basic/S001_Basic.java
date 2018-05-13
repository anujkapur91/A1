package selenium_basic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select; 
import java.util.concurrent.TimeUnit;

public class S001_Basic {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "‪E:\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://demoqa.com/");
        
		System.out.println("working");
        
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
        
		String url = driver.getCurrentUrl();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
        System.out.println(url);
        
        
        if (url.equals("http://demoqa.com/registration/"))
        {
        	System.out.println("registration page is open"); 
        	driver.findElement(By.xpath(".//*[@id='name_3_firstname']")).sendKeys("Anuj");
        	driver.findElement(By.xpath(".//*[@id='name_3_lastname']")).sendKeys("Kapur");
        	driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[1]")).click();
        	driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/div/input[3]")).click();
        	
        	
        	Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='dropdown_7']")));
        	
        	dropdown.selectByIndex(2);
        	
        	driver.findElement(By.xpath(".//*[@id='description']")).sendKeys("Ram is a good boy");
        	
        	
        	
        }
        
        else 
        {
        	System.out.println("registration page did not open");
        }
		
	
	}

}
