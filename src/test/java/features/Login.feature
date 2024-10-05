Feature: Login Functionality
  Scenario: User should be able to login to the app
    When User enter the username
    When User enter password
    When User click on login button
    Then User should be navigated to the Home page
