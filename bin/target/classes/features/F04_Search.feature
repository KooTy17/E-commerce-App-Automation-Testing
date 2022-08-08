
Feature: F04_Search | user could search products
  Scenario Outline: user could search using product name
    When user clicks on search
    And user types product's name "<productName>"
    And user press on search button
    Then user gets products results "<productName>"
    Examples:
      | productName |
      | book |
      | laptop |
      | nike |
  Scenario Outline: user could search for product using sku
    When user clicks on search
    And user types product's sku "<sku>"
    And user press on search button
    Then user gets products' sku results "<sku>"
    Examples:
      | sku |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |