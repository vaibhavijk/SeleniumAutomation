Feature: Application login
@portalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards are displayed "true"

@portalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "john" and password "4567"
Then Home page is populated
And Cards are displayed "false"

@portalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User signup with following details
|jenny|abcd|jenny@abc.com|India|123456|
Then Home page is populated
And Cards are displayed "false"

@portalTest
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login in to application with <Username> and Password <password>
Then Home page is populated
And Cards are displayed "true"

Examples:
|Username|password|
|User1   |pass1   |
|User2   |pass2   |
|User3   |pass3   |
|User4   |pass4   |
|User5   |pass5   |
