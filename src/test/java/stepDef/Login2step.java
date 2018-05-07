package stepDef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import allBrowser.BrowserInitialize;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class Login2step {
	
	
 WebDriver driver;
 BrowserInitialize br;
 LoginPage lp;
 
 
 @Given("^Admin Navigateto HRMLogin Page$")
public void admin_Navigateto_HRMLogin_Page() throws Throwable {
  br=new   BrowserInitialize() ;
  driver=br.chooseBrowser();
}
  @When("^Admin Entervalid UseNameand Password$")
public void admin_Entervalid_UseNameand_Password() throws Throwable {
   lp=new LoginPage(driver);
   lp.EnterUserName1();
   lp.EnterPasword1();
}
 @When("^click on LoginButton$")
public void click_on_LoginButton() throws Throwable {
	 lp=new LoginPage(driver);
	   lp.clickLogin();
}

 @Then("^Admin will Land inAdminhome page$")
public void admin_will_Land_inAdminhome_page() throws Throwable {
    
	 Assert.assertEquals(driver.getCurrentUrl(), "http://opensource.demo.orangehrmlive.com/");
		driver.close();
}
}
