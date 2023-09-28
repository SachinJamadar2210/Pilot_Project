Feature: Check PIM module

Background:
Given the employee is logged into the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When user click the "PIM" tab in the menu

@CheckConfiguration 
Scenario: Employee checks configuration
When I click configuration 
And select reporting methods
Then click add
And enter name
Then click on save
And assert the found record