Feature: To verify the login validity

  Background: 
    Given User should be in the login page

  Scenario: To verify the login functionality using invalid credentials
    When User should enter the username and password
      | Cheese  | Macroni |
      | Avacado | Burst   |
      | Maple   | Syrup   |
    And User click login
    Then user should navigate to the login attempt page

  Scenario: To verify the Create acoount functionality
    When User has to click the Create new account
    Then User should have navigated to the create account page
