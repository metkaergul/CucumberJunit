Feature:Web table user order feature


  Scenario: user should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "Familybea"
    And user enters quantity 2
    And user enters Customer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters City "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects credit card type "Visa"
    And user enters credit card number "111222223344"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table

  @wip
  Scenario Outline: user should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "<productType>"
    And user enters quantity <quantity>
    And user enters Customer name "<customerName>"
    And user enters street "<street>"
    And user enters City "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zipCode>"
    And user selects credit card type "<creditCartType>"
    And user enters credit card number "<creditCardNumber>"
    And user enters expiry date "<expirationDate>"
    And user enters process order button
    Then user should see "<expectedName>" in first row of the web table

    @femaleScientists
    Examples:Famous female scientists
      | productType | quantity | customerName       | street    | city   | state   | zipCode | creditCartType | creditCardNumber | expirationDate | expectedName       |
      | MoneyCog    | 2        | Marie Curie        | London St | London | England | 50505   | Visa           | 111223344544     | 12/24          | Marie Curie        |
      | Familybea   | 2        | Rosalind Franklin  | London St | London | England | 50505   | Visa           | 111223344544     | 12/24          | Rosalind Franklin  |
      | Screenable  | 2        | Lisa Meitner       | London St | London | England | 50505   | Visa           | 111223344544     | 12/24          | Lisa Meitner       |
      | MoneyCog    | 2        | Barbara McClintock | London St | London | England | 50505   | Visa           | 111223344544     | 12/24          | Barbara McClintock |
      | MoneyCog    | 2        | Marie Curie        | London St | London | England | 50505   | Visa           | 111223344544     | 12/24          | Marie Curie        |
    Examples:Famous male scientists
      | productType | quantity | customerName       | street    | city   | state   | zipCode | creditCartType | creditCardNumber | expirationDate | expectedName       |
      | MoneyCog    | 2        | Charles Darwin     | London St | London | England | 50505   | Visa           | 111223344544     | 12/24          | Charles Darwin     |
      | Familybea   | 2        | Albert Einstein    | London St | London | England | 50505   | Visa           | 111223344544     | 12/24          | Albert Einstein    |
      | Screenable  | 2        | Galileo            | London St | London | England | 50505   | Visa           | 111223344544     | 12/24          | Galileo            |
      | MoneyCog    | 2        | Barbara McClintock | London St | London | England | 50505   | Visa           | 111223344544     | 12/24          | Barbara McClintock |
      | MoneyCog    | 2        | Isac Newtoon       | London St | London | England | 50505   | Visa           | 111223344544     | 12/24          | Isac Newtoon       |


