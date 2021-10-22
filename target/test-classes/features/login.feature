Feature: Login to retail website
@SmokeTest
Scenario: Retail website login test
Given user is on retail website login
When  user click on my account 
And user click on login 
And user enter email 'eagles@tekschool.us'
And user enter password 'eagles'
And user click on login button
Then user confirm the login status
