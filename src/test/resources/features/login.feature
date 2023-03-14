Feature: login Functionality
  As a user, I should be able to login.

@map
  Scenario: Login with valid credentials
    When Go to login page
    And Enter valid username "Employee50" in username field
    And Enter valid password "Employee123" in password field
    And Click on the login button
    Then user should login with  valid credentials by clicking login button


  @check
  Scenario Outline: user can not login with invalid credentials
    When Go to login page
    And Enter referred credentials "<username>" "<password>"
    And Click on the login button
    Then user should not be login and  see the message

    Examples:

      | username    | password    |
      | Employee130 | asde123     |
      | saasEe13    | asde123     |
      | saasEe130   | Employee123 |


