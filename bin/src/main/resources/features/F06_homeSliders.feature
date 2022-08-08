
  Feature: F06_homeSliders | User could select home page sliders
    Scenario: first slider is clickable on home page
      When user clicks on first slider button
      And user clicks on first product
      Then user go to first product page

    Scenario: second slider is clickable on home page
      When user clicks on second slider button
      And user clicks on second product
      Then user go to second product page