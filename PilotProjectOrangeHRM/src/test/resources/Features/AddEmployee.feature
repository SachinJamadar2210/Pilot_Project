Feature: Check PIM module

Background:
Given the employee is logged into the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When user click the "PIM" tab in the menu
 
@CheckAddEmployee
Scenario Outline: Employee checks add employee 
When user click add Employee
And add the details
| fname |mname| lname | eid |
|Rahul  | M   | patole|4325|       
Then click on toggleButton
Then enter details
|usrname| passowrd | confPassword |
|RajuLmm| Rajul@123 |Rajul@123|
Then click on save button
Then click on contactDetails
And Enter Data in Contactus form "<SheetName>" and <Rownumber>
Then save the details
And validate successfull addition of contact details
 Examples:
      | SheetName         |  Rownumber |
      | persaonalData     |     0      |


@DeleteEmployeeRecord
Scenario: Checking Employee list
Given scroll down the page
And I click on delete 
And I grant delete access
Then validate the deleted record







