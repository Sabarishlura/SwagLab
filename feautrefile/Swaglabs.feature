Feature: Validate the SwagLab e-commerce website

Scenario: Verifying the login page 
Given the user is on the login page
When the user enters "<Username>" in the username field
And the user enters "<Password>" in the password field
Then the user clicks the login button

Scenario: Verifying the home page
Given the user adds a product to the cart
When user click the add to cart button

Scenario: Verfying the cart page
Given the user removes the product from the cart
Then the user should be navigated to the checkout page

Scenario: Verifying the checkout page
And the user enters their first name 
And the user enters their last name
And the user enters a valid zip code
And the user click the continue button
Then the user should be able to proceed with the checkout process for delivery
