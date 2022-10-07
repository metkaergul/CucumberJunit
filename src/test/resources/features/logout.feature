Feature: Library app logout feature
  User Story:
  As a user I should be able to log out and lands on "Login" page after logged out

  Background: For the scenarios in the feature file, user is expected to be on home page




  @librarian
  Scenario: Logout from the profile menu
    Given user is on the home page
    When user click the profile menu
    And user click the Logout option
    Then user should land on the login page



#  Acceptance Criteria:
#  1- User can log out by using log out button inside profile info and ends up in login page.
#
#  2-User should land on "Login" page after logs out
#
#  3- The user can not go to the home page again by clicking the step back button after successfully logged out.
#
#  4- The user must be logged out if the user close the tab (if there are multiple open tabs in the app, close all of them)
#
#  5- The user must be logged out if the user is away from keyboard for 3 minutes (AFK)
#  (if the user does not do any  mouse or keyboard action for 3 minutes)