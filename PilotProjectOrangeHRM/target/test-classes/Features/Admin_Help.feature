Feature: Validating the Admin Functionality in Organization

Background:
Given Open Browser OrangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When Use enter login details
And click the Login btn
Given Select Admin

Scenario: Checking the functionality of Help
And Select User Management and click on user
When Click on Help
Then validate Help function working fine or not