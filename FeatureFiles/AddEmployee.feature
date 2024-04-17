Feature:
As admin user add new employee
@AddEmp
Scenario Outline:
Add employee with multiple data
Given User navigates to url as"http://orangehrm.qedgetech.com/" in a browser
When User login by entering username as "Admin"
And Usr login by entering password as "Qedge123!@#"
And click on login button
Then user should login successfully
When user clicks PIM
When user clicks Add button
When user enters "<First Name>" in fname
And user enters "<Middle Name>" in mnme
And user enters "<Last Name>" in lname
And capture Eid Before Adding
And user click on Save button
And capture Eid after adding
Then user validates Eid
Then user close browser
Examples:
|First Name|Middle Name|Last Name|
|Mohammed  |Abdul      |Wajeed   |
|Mohammed  |Abdul      |Majid    |
|Mohammed  |Abdul      |Waheed   |
|Mohammed  |Abdul      |Hameed   |
|Mohammed  |Abdul      |Rasheed  |