Feature: SauceDemo BDD DDT 

Scenario Outline: Entire flow of SauceDemo with DDT 
	Given Launch the Chrome browser 
	And Load the URL and maximize 
	When Enter Username as <username>
	And Enter Password as <password>
	And Click on Login 
	When Click on Sauce Labs Fleece Jacket 
	And Click on Add to Cart 
	And Click on Back To Products 
	And Click on Sauce Labs Bolt T-Shirt 
	And Add Bolt T-Shirt to Cart
	And Click on Shopping Cart Container on the top 
	And Click on Checkout 
	When Enter FirstName as 'Poorna' 
	And Enter LastName as 'Ravi' 
	And Enter Zip as '12345' 
	And Click on Continue 
	And Click on Finish 
	Then Verify success message 
	
	Examples:
	|	username				|	password		|
	|'standard_user'			|	'secret_sauce'	|
	|'performance_glitch_user'	|	'secret_sauce'	|

	