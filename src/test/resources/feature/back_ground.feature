Feature: Login to HRM Application
Background:
Given user is on HRM login Page

@ValidCredentials
Scenario:Login with valid credentials


When User enters username "Admin" and password "admin123"
Then User should be able to login successfully

@Missingusername
Scenario: BLANK USERNAME

When username is " " and password is "admin123"
Then user should get error message 