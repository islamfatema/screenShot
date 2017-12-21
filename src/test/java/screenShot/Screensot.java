package screenShot;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Screensot {
@Test
public void captureScreenShot() throws IOException {
	System.setProperty("webdriver.gecko.driver", "/Users/fatemaislam/Downloads/geckodriver");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("islam@gmail.com");
	TakesScreenshot tss=(TakesScreenshot)driver;
	File source= tss.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("./screenshots/facebook.png"));
}
}
