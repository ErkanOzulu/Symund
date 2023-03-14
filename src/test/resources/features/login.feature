Feature: Login Functionality
  As a user, I should be able to login.

  @TC-001
  Scenario: Login with valid credentials by clicking login button
    When Go to login page
    And Enter valid username "Employee130" in username field
    And Enter valid password "Employee123" in password field
    And Click on the login button
    Then Verify that user can login

@TC-002
  Scenario: Login with valid credentials  by hitting  "Enter" key from the keyboard
    When Go to login page
    And Enter valid username in username field and password in password field
      | username | Employee130 |
      | password | Employee123 |
    And hit enter key word
    Then Verify that user can login

  @TC-003
  Scenario Outline: user can not login with invalid credentials
    When Go to login page
    And Enter referred credentials "<username>" "<password>"
    And Click on the login button
    Then user should not be login and  see the message "Wrong username or password."

    Examples:

      | username    | password    |
      | Employee130 | asde123     |
      | saasEe13    | asde123     |
      | saasEe130   | Employee123 |
      | employee130 | Employee123 |
      | Employee123 | employee123 |

@TC-004
Scenario Outline: user can not login with blank credentials
When Go to login page
And Enter referred credentials "<username>" "<password>"
And Click on the login button
Then user should not be login and  see the pop-up message "Please fill out this field"

  Examples:
  |username|password|
  |Employee130|     |
  |employee130|     |
  |           |     |
  |           |Employee123|
  |           |employee123|



  #Declarative Example:

  Scenario: Verify login

    Given user navigate to the Website

    When user enters credentials

    Then the user clicks on the sign-in button

    Then validate the title after login

