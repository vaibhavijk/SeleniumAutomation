Feature: Automation website

  Scenario: Home page with three sliders
    Given Browser is open
    When User clicks on ShopMenu
    And User clicks Home menu button
    Then Home page has Three Sliders only
