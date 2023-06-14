Feature: Scenario outline 

Scenario Outline: Scenario Outline Use
   Given the user is on '<website>'
		And the user input UserId as '<userID>'
		And the user input Password as '<password>'
	 When the user click on the login button
 Examples: 
       | website  														 | userID 		 | password  |
       | https://demo.guru99.com/V4/index.php						   | mngr506580  | tYrumyp 	 |
      
Scenario: New Login
   Given the user is on "https://demo.guru99.com/V4/index.php"
		And the user input UserId as "mngr506580"
		And the user input Password as "tYrumyp"
When the user click on the login button