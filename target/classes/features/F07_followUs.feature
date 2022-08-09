@smoke
  Feature: D07_followUsStep | User could follow any social media
    Scenario: user opens facebook link
      When user opens facebook link
      Then "https://www.facebook.com/nopCommerce" Facebook is opened in new tab

    Scenario: user opens twitter link
      When user opens twitter link
      Then "https://twitter.com/nopCommerce" Twitter is opened in new tab

    Scenario: user opens rss link
      When user opens rss link
      Then "https://demo.nopcommerce.com/new-online-store-is-open" Rss is opened in new tab

    Scenario: user opens youtube link
      When user opens youtube link
      Then "https://www.youtube.com/user/nopCommerce" YouTube is opened in new tab