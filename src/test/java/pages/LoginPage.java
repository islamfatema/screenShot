package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
   
	public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	//Page factory Model
	//username
	@FindBy(how=How.XPATH, using="//input[@name='txtUsername']")
	@CacheLookup
	WebElement user_name;
	public WebElement EnterUserName1() {
		return user_name;
		
	}
	//password
	@FindBy(how=How.XPATH, using="//input[@name='txtpassword']")
	@CacheLookup
	WebElement password;
	public WebElement EnterPasword1() {
		return password;
		
	}
	//login
	@FindBy(how=How.XPATH, using="//input[@name='Submit']")
	@CacheLookup
	WebElement login;
	public WebElement clickLogin() {
		return login;
		
	}
	

	
	
	
	
	
//Page Object Model
//	public void enterUserName() {
//		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
//	}
//public void enterUserPassword() {
//	driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin");
//	}
//public void clickLoginButton() {
//	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
//}
//	
	
	
	
	
	
}
//*[]