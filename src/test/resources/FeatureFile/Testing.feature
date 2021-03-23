@EndtoendTesting
Feature: Validating the Addactin hotel App


Scenario Outline: Validating the login screen
Given user is in the login page
When user passing the valid "<username>" and "<Password>"
And click on Login button
Then user should enter in to the Search hotel screen
Examples: 
|username|Password|
|RudeshVA1|Newday@01|
Scenario Outline: Validating the Search Hotel Page
Given user is in the Login screen and after passing the valid credentials user will enter to the search hotel screen
When user passsing valid "<UserName>" and "<PassWord>"
And Click on Login button in login screen
And After entering into the search hotel screen user is selecting all the mandatory fields
Then Click on Search button
Examples: 
|UserName|PassWord|
|RudeshVA1|Newday@01|

Scenario: Validating the Select Hotel page
Given User is in the login page
When Passing valid details in the login and search hotel screen
And selecting the hotel in the screen
Then Click on continue

Scenario: Validating the personal details screen
Given user is in the login screen
When user passing valid details
Then user clicking on Book now
And user should see 


