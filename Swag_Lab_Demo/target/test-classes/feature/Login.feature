Feature: Swag Application login

  Scenario: Check login in successful with valid credentials
    Given Browser is open
    And User is on login page
    When User enters username and password
    And User clicks on login
    Then User clicks on logout
