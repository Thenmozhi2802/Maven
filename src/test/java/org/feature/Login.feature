Feature: FaceBook Login Validation
Background:
Given Launch browser and Url
@NineAm
Scenario Outline: Login validation

And pass the username "<Username>"
And pass the password "<Password>"
Then click the login
Then validate the page
Examples:
  |Username|Password|
  |Thenmozhi|Then@123|
  |Giri|Giri@123|
  |Uma|Uma@123|

Scenario: validation
And pass the username
And pass the password
