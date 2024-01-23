Feature: Login feature
  Scenario: login with valid credentials
    Given user visits the websites
    When user enters username and password
    And user clicks on login button
    Then user can browse the website