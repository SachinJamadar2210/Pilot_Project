Feature: Validating the Admin Functionality in Pay Grades
#Common Login
Background:
Given Open Browser OrangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When Use enter login details
And click the Login btn
Given Select Admin

@ValidatingPayGrade
Scenario: Checking the functionality Pay Grades in Job
And Select Job and click on Pay Grades
When Click on Add and fill the details of Pay Grades
And Click on Save Pay Grades
Then User validate the saved successfully Pay Grades