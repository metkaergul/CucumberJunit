
@Wiki
Feature: Wikipedia Search Functionality Title Verification
    As a user when I am on the wiki homepage
    i should be able to search whatever I want and see relevant information


Scenario: Search functionality result title verification

Given  User is on Wikipedia home page
When User types Steve Jobs in the wiki search box
And User clicks wiki search button
Then User sees Steve Jobs is in the wiki title
