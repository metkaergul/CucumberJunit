@Google
Feature: Google Search Functionality Title Verification
  As a user, when I am on the Google search page
  I should be able to search whatever I want and see relevant information


  Scenario: Search page title verification
    When User is on Google search page
    Then User should see title is Google



  Scenario: Search functionality result title verification
    Given User is on Google search page
    When user types apple and clicks enter
    Then user sees apple in the google title


  Scenario: Search functionality result title verification
    Given User is on Google search page
    When user types "apple" and clicks enter
    Then user sees "apple" in the google title








#    When User types Steve Jobs in the google search box and clicks enter
#    Then  User sees Steve Jobs is in the google title


