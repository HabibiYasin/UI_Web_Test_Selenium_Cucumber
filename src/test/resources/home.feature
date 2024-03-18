@home

Feature: Home

  @image-home
  Scenario: user can see image product
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    When homepage is loaded
    Then user can see product image

  @price-home
  Scenario: user can see image product
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    When homepage is loaded
    Then user can see product price