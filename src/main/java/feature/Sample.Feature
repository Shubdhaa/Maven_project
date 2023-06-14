Feature: Login 

Scenario: Login to account
	Given the user is on website
		And the user input userID
		And the user input password
	When the user clicks on the login button
	Then the user is on profile page
	
	
	