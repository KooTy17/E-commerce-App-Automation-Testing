@smoke
  Feature: D08_WishlistStep | User could wishlist products
    Scenario: User could wishlist products
      When user add "HTC One M8 Android L 5.0 Lollipop" to wishlist
      Then user could see success message

    Scenario: User could wishlist products again
      When user add "HTC One M8 Android L 5.0 Lollipop" to wishlist
      And user could see success message
      And user clicks on wishlist button
      Then user could see wishlisted products