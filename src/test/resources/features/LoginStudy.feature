Feature: user logs-in the web page with valid credentials

  Background: user is expected to be on the login page
    Given user is on login page


  Scenario: driver
    When driver enters username as "user1"
    And driver enters password as "UserUser123"
    And driver clicks the login page
    Then driver can see "Quick Launchpat" text

  @wip2
  Scenario Outline: store manager or sales manager enter credentials

    When storemanager or sales manager enter username as "<username>"
    And storemanager or sales manager enter password as "<password>"
    And storemanager or sales manager clicks the login page
    Then storemanager or sales manager can see "<dashboard>" on the homepage

    Examples:
      | username       | password     | dashboard |
      | storemanager51 | UserUser123  | Dashboard |
      | storemanager52 | UserUser123  | Dashboard |
      | storemanager53 | UserUser1465 | Dashboard |
    @salesManager
    Examples:
      | username        | password     | dashboard |
      | salesmanager101 | UserUser123  | Dashboard |
      | salesmanager102 | UserUser123  | Dashboard |
      | salesmanager103 | UserUser1465 | Dashboard |



#  Scenario: store manager sales manager
#
#    When salesmanager enters "<username>"
#    And salesmanager enters "<password>"
#    And salesmanager clicks the login page
#    Then  salesmanager can see "<dashboard>" on the homepage
