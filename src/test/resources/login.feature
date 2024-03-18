@login
Feature: Login

  @valid-login
  Scenario: Login using valid email and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user is on homepage

  @invalid-login
  Scenario: Login using invalid email and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "invalid"
    When user click login button
    Then user able to see error message "Epic sadface: Username and password do not match any user in this service"

  @username-blank-login
  Scenario: Login using blank email and password
    Given user is on login page
    And user input username with ""
    And user input password with ""
    When user click login button
    Then user able to see error message "Epic sadface: Username is required"

  @password-blank-login
  Scenario: Login using valid email and blank password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with ""
    When user click login button
    Then user able to see error message "Epic sadface: Password is required"

  @lockedout-login
  Scenario: Login using lockedout email and password
    Given user is on login page
    And user input username with "locked_out_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user able to see error message "Epic sadface: Sorry, this user has been locked out."

  @without-login
  Scenario: Going to main page without login
    Given user is on login page
    When user going to main page without login
    Then user able to see error message "Epic sadface: You can only access '/inventory.html' when you are logged in."