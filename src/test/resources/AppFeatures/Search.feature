Feature: Amazon search

@Smoke
Scenario: Search a Product MacBook Air
Given I have a search field on Amazon page
When I search for a product with name "Apple MacBook pro" and price 1000
Then Product with name "Apple MacBook Pro" should be displayed

@Regression
Scenario: Search a Product iPhone
Given I have a search field on Amazon page
When I search for a product with name "iPhone" and price 200
Then Product with name "iPhone" should be displayed
 