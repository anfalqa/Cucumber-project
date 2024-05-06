

Feature: Test login functionality 

  Scenario: TO login with random user name
    Given Select one random user name to finish the login process
    When choose the right name and click on login button
    Then User should navigate to account page