@Login
Feature: Admin login to HRM home page
IN order to Login to oOrange HRM
As a Admin with valid Username and Password
I want to Enter UserName,Password, click on on Login Button to Access

Scenario: Positive- Admin Login Successfully
 Given Admin Navigate to HRM Login Page
 When Admin Enter valid UseName and Password
 And click on Login Button
 Then Admin will Land in Admin home page
 
 