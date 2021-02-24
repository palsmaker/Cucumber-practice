Feature: Uber booking feature

Scenario: Booking cab
Given User wants to select a car type "sedan" from uber application
When user select car "sedan" and pick up point "bglr" and drop location "pune"
Then driver starts the journey
And driver ends the journey
Then user pays $1000