Feature: Amazon order page
In order to check my order details 
As a registered user
I want to specify the features of order details page

Background:
Given a registered user exists
Given user is on Amazon login page
When user enters username
And user enters password
And user clicks on login button
Then the user navigates to the order page


Scenario: Check previous order details
When user clicks on order link
Then user checks the previous order details

Scenario: Check open order details
When user clicks on open order link
Then user checks the open order details

Scenario: Check cancelled order details
When user clicks on cancelled order link
Then user checks the cancelled order details

