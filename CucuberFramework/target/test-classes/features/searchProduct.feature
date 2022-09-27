
Feature: Search and place the order for the products

  Scenario: Search expirence for the product search in home page and offers page
    Given User is on GreenCart landing page
    And User searched with shortname "Tom" and extract actual name of product
    When User searched for "Tom" shortname in offers page
    And Validate product name in offers page matches with landing page
  