package allBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
public class BrowserInitialize {
	
	
 WebDriver driver;
 
 public WebDriver chooseBrowser() {
	 
	 ResourceBundle rb= ResourceBundle.getBundle("config");
	 String B=rb.getString("Browser");
	 if(B.equalsIgnoreCase("Firefox")) {
		 System.setProperty("webdriver.gecko.driver", "/Users/fatemaislam/Downloads/geckodriver"); 
	 	   driver=new FirefoxDriver();
	 	   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	 }
	 else {
		 System.setProperty("webdriver.gecko.driver", "/Users/fatemaislam/Downloads/geckodriver"); 
	 	   driver=new FirefoxDriver();
	 	   driver.get("http://opensource.demo.orangehrmlive.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	 }
	 
	 
	driver.get("http://opensource.demo.orangehrmlive.com/");
	 return driver;
 }
}
