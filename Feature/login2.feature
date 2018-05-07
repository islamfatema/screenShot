@Login2
Feature: Adminlogin to HRM home page
IN order to Loginto Orange HRM
As a Admin with valid Username and Password
I want to Enter UserName,Password, click on on Login Button to Access

Scenario: Positive- AdminLoginSuccessfully
 Given Admin Navigateto HRMLogin Page
 When Admin Entervalid UseNameand Password
 And click on LoginButton
 Then Admin will Land inAdminhome page
 
  
