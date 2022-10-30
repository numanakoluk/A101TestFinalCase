Feature: Hepsiburada Case Study

  @Regression
  Scenario: Add product to shopping cart
    * Cookies are expected
    * User navigates to home page
    * User searches for "SAMSUNG"
    * User chooses product
    * User adds two product from different shops
    * Products should be added to shopping cart


  @Regression
  Scenario: Log in and add product to shopping cart
    * Cookies are expected
    * User navigates to home page
    * User logs in with credentials
    * User should be logged in
    * User searches for "SAMSUNG"
    * User chooses product
    * User adds two product from different shops
    * Products should be added to shopping cart