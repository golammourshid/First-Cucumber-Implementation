Feature: Login feature

  Scenario Outline: login with valid credentials
    Given user visits the websites
    When user enters username "<username>" and password "<password>"
    And user clicks on login button
    Then user can browse the website
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |