package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
features="Feature",
glue="stepDef",
tags="@Login"




)
public class TC01_Login  extends AbstractTestNGCucumberTests{


}//end class
