Feature: Check PIM module
Background:
Given the employee is logged into the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When user click the "PIM" tab in the menu

@EmployeeList
Scenario: Checking Employee list
Then enter the details
And click on search
Then record must successfully saved