Feature: Free CRM Create Contacts

Scenario: Free CRM Create a new contact scenario

Given user is already on Login Page
When title of login page is Free CRM
When user enters username and password
Then user clicks on login button
Then user is on home page
Then Close the browser
