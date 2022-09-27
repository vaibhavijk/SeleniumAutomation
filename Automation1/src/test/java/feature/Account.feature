Feature: Application login
  
 Background:
Given validate the browser
When browser is triggered
Then check if browser is started
  
@smokeTest  
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards are displayed "true"


