@Purchase
  Feature: Purchase
    As valid user i can sort product by High to Low

  Scenario: Pick one item from inventory
    Given User open the web sauce demo
    When User input "standard_user" as userName and "secret_sauce" as password and click login
    Then User already on dashboard page
    When User sort product by "Price (high to low)"
    And User add to click button add to cart item "Sauce Labs Backpack"
    And User add to click button add to cart item "Sauce Labs Bike Light"