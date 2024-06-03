Feature: Amazon Cart page Validation


Scenario: Adding an item in cart and verifying sub total
Given User is on Amazon Page
And User search field type "<Item>"
Then User selects item in the list
And User clicks on Add to Cart
When User clicks on Cart on top left
Then User verifies cart price to product page
And Verifies sub total is identical to product page

Examples:
|Item|
|Monitor|
|Laptop|