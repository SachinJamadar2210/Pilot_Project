Feature: Check PIM module

Background:
Given the employee is logged into the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When user click the "PIM" tab in the menu

@DeleteEmployeeRecord
Scenario: Checking Employee list
Given scroll down the page
And I click on delete 
And I grant delete access
Then validate the deleted record
