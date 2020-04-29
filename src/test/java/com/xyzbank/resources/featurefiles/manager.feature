Feature: Bank manager features

  Bank manager can open account successfully

  Scenario: User can add customer successfully
    Given I am on Home page
    When I click on Bank Manager link
    Then I click on add customer link
    And I enter first name "Ram"
    And I enter last name "Raghuvanshi"
    And I enter Postcode "LE8 6HJ"
    Then I click on Add customer button

  Scenario: User can open account successfully
    Given I am on bank manager log in page
    When I click on open account link
    And I select customer name form menu
    And I select currency from menu
    Then I click on process button
