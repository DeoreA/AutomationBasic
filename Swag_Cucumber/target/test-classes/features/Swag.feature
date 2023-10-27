Feature: Test Swag Application Product is added or not

Background: 
Given user is already in Swag application login page
And logged in with valid username and password
    
Scenario: Verify Add to Card functionality
When User click on any product
And Click on Add to card button
And user can click on checkout button
Then Validate Product is added or not 
And User Enter there  personal detail than click on login button
And User can able to click on Finish button
Then User can validate the ThankYou meassage
And Logout from application 


