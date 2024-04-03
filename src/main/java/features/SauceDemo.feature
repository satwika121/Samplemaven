Feature: SauceDemo BDD

Scenario: Entire flow of SauceDemo
Given Launch the Chrome browser
And Load the URL and maximize
When Enter Username as 'standard_user'
And Enter Password as 'secret_sauce'
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

