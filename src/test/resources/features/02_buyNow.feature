Feature: Test Flipkart Buy Now Functionality

Scenario: User tries to buy a product without logging in

Given Open the Flipkart website
When Close the login popup
And Search Mobiles in search bar
And Open the first mobile
And Click on Buy Now
Then The login popup should appear
