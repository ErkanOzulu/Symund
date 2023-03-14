Feature: Notes Functionality
  As a user, I should be able to login and add new notes

  @dene
  Scenario: creat notes and add notes
    Given user is already logged on dashboard
    When user click notes
    When user click new notes
    And user add notes "I love Cucumber"
    Then user should see notes on dashboard
