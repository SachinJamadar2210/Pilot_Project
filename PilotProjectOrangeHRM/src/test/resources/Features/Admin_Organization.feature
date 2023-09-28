Feature: Validating the Admin Functionality in Organization

Background:
Given Open Browser OrangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When Use enter login details
And click the Login btn
Given Select Admin

@ValidatingGeneralInfo
Scenario: Checking the functionality of General Informationf in Organization
When Click on Organization and select General Informationf
And Click on Edit and fill the details 
Then Take screeshotUser succesfully

@CreatingUserByLocation
Scenario: Checking the functionality of Location in Organization
When Click on Organization and select Location
And Click on Add and fill the details 
Then User validate the saved successfully

@ValidatingUserByLocationInOraganization
Scenario: Searching the user by selecting the Location in Organization
When Click on Organization and select Location
And User Click the Search Btn
Then get the user and validate the user by it location 