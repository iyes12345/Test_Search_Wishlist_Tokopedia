Feature: Search Product and Wishlist Tokopedia

  Scenario: User search product item
    When User go to Web Tokopedia
    And User click and input text search
    And User click button search
    And User click item
    Then User click button wishlist