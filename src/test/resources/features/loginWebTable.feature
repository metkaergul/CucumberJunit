Feature: Web tables app login functionality
  user should be able to login using correct credentials

  Background: User is on the login page
    Given user is on the login page of web table app


  Scenario: Positive Login scenario

    When user enters username "Test"
    And user enters password "Tester"
    And  user click the login button
    Then user should see url contains orders


  Scenario: Positive Login scenario

    When user enters username "Test" password "Tester" and logins
    Then user should see url contains orders


    Scenario: user should see all  12 months under the months dropdown
    When User enters  below credentials
      | username | Test   |
      | password | Tester |

    Then user should see url contains orders



