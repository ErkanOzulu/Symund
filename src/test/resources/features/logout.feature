

Feature: Logout fonction
  Background: User on the dashboard
    When Go to login page
    And Enter valid username "Employee130" in username field
    And Enter valid password "Employee123" in password field
    And Click on the login button
   Scenario:Verify user can log out and ends up in login page
     When user click E module
     And  user click the Log out button
     Then user should lands login page
  @map
Scenario:Verify user can not go to home page again by clicking step back button after successfully logged out.
  When user click E module
  And  user click the Log out button
  And user click step back button
  Then user should not on home page