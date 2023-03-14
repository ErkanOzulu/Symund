Feature: Login Functionality
  As a user, I should be able to login.

  @valid
  Scenario: Login with valid credentials
    When Go to login page
    And Enter valid username "Employee130" in username field
    And Enter valid password "Employee123" in password field
    And Click on the login button
    Then user should login with  valid credentials by clicking login button

  @map
  Scenario: Login with valid credentials
    When Go to login page
    And Enter valid username in username field and password in password field
      | username | Employee130 |
      | password | Employee123 |
    And Click on the login button
    Then User should see this list
      | Set status |
      | Settings   |
      | Help       |
      | Log out    |

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

Feature:  I want to login into the site with valid data and Invalid data
  Background:
    Given I navigate to the Website
  Scenario: Login as a new sign-up user with valid data
    When I entered the user name
    And I entered the password
    And click on the sign-in button
    Then validate user successfully logged-in
    But log-in button is not present
  Scenario: Login as a new sign-up user with invalid data
    When I entered an invalid user name
    And I entered the password
    And click on the sign-in button
    Then Error message should display
    But Re-login option be available


  #Declarative Example:

  Scenario: Verify login

    Given user navigate to the Website

    When user enters credentials

    Then the user clicks on the sign-in button

    Then validate the title after login

  #Imperative Example:

  Scenario: Verify login

    Given I navigate to the Website

    When I enter “username”

    When I enter “password”

    When I check the “Remember me” check box

    Then the user clicks on the sign-in button

    Then Validate the title after login