Feature: Customer Features
  Customer can deposit money successfully

  Scenario: User should log in successfully
    Given I am on Home page
    When I click on customer link
    And I select customer name form drop down "Harry Potter"
    Then I click on log in button

  Scenario: User should deposit money successfully
    Given I am on Home page
    When I click on customer link
    And I select customer name form drop down "Harry Potter"
    And I click on log in button
    When I click on deposit link
    And I enter amount to deposit "100"
    Then I click on deposit button