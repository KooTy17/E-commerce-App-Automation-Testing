@smoke
Feature: F03_Home | User could change the currency
  Scenario: User could change the currency
    When user press the dropdown list on the top left of home page
    And user select euro currency
    Then user could see products in euro currency