Feature: Check PIM module

Background:
Given the employee is logged into the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When user click the "PIM" tab in the menu

@CheckReports 
Scenario: Employee checks configuration
When I click on reports
And click on add
Then enter report name
And select select criteria
Then choose the option
And select dispay fields group
Then choose display group option
And select display field
Then choose thr display option
And click on plus
Then save the record and validate it