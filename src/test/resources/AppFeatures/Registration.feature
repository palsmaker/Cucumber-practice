Feature: User Registration

Scenario: User registrstion with different data
Given User is on registration page
When User enters following user details
   | nav | automation | nav@gmail.com | 
   | lisa | doseh | yol@gmail.com | 
Then user registration should be successful
