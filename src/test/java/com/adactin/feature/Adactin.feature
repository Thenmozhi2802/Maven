Feature: Adactin Login Validation
Background: 
Given Launch browser and Url
Scenario: Login validation
And pass the username
And pass the password
Then click the login
And select the location
And select the hotel
And select the roomtype
And choose no of rooms
And checkin date
And checkout date
And adults per room
And children per room
Then click the search
And select hotel
Then click continue
And enter firstname
And enter lastname
And enter billing address
And enter creditcard num
And select creditcard type
And select expiry date
And enter ccv num
Then click book now
Then click logout

