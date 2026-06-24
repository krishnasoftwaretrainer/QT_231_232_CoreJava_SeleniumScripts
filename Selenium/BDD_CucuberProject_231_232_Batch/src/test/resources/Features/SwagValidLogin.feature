Feature: Valid Login for Swaglabs
Scenario: Successful Login
Given user should be on Swaglabs loginpage 
When user enter valid username "standard_user"
And user enter valid password "secret_sauce"
And click on login button
Then user should see the products page
