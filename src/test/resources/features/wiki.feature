Feature: Wikipedia Search Functionality and verifications
  As a user when I am on the wiki homepage
  i should be able to search whatever I want and see relevant information


  Scenario: Wikipedia Search Functionality  Title Verification
    Given  User is on Wikipedia home page
    When User types "Bill Gates" in the wiki search box
    And User clicks wiki search button
    Then User sees "Bill Gates" is in the wiki title


  Scenario: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then  User sees "Steve Jobs" is in the main header

  @Wiki
  Scenario: Wikipedia Search Functionality Image Header Verification
  Given User is on Wikipedia home page
  When User types "Nelson Mandela" in the wiki search box
  And User clicks wiki search button
  Then User sees "Nelson Mandela" is in the image header


  @ScenarioOutline
  Scenario Outline:  Wikipedia Search Functionality  Title Verification
    Given  User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header

    Examples: search values we are going to be using in this scenario is as below
      | searchValue       | expectedTitle     | expectedMainHeader |
      | Steve Jobs        | Steve Jobs        | Steve Jobs         |
      | Cristiano Ronaldo | Cristiano Ronaldo | Cristiano Ronaldo  |
      | Chuck Norris      | Chuck Norris      | Chuck Norris       |
      | Marie Curie       | Marie Curie       | Marie Curie        |
      | Lady Gaga         | Lady Gaga         | Lady Gaga          |


