Feature: Orange HRM Login feature test

@Validating
Scenario Outline: To validate the Login feature of the OrangeHRM 
Given Open Browser OrangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When User enter the UserName and PassWord 
And click the Login btn
Then Validating Login Page