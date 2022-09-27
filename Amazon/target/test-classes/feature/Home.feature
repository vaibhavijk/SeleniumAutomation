Feature: Amazon GiftDeal

  Scenario: Amazon GiftDeal 
    Given Landing on amazon website
    When User login into application with "8050111825" and click on cont
    Then User clicks on password with "Amazon@123" click on cont
    Then Signin to home page and Select gift deal
    And Select the first item from Deals Add the item to the cart
