Feature: Login 

Background: 
	Given the user is on website
		And the user input userID
		And the user input password
	When the user clicks on the login button
	
Scenario: Login to account
	Then the user is on profile page
	
	Scenario: New Customer
		Given the user selects New Customer tab
			And the user adds all details
		When the user clicks on Submit button
		Then the user can see New user created popup
		
		