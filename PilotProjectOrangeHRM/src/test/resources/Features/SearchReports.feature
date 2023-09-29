Feature: Check PIM module

Background:
Given the employee is logged into the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When user click the "PIM" tab in the menu

@SearcReports
Scenario Outline: Search for reports
When search for pim and click
Then click on reports
When user enters <reportname>
Then click on search button below
And assert the record

Examples:
| reportname|
| ja        |