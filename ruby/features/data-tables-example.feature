Feature: Data Table Example

  Scenario: Demonstrating Data Tables
    Given I have filled in the following address
      | house_number | street_name     | town   |
      | 17           | Galexie Gardens | London |
    When I select address type
    Then I will be presented with three address types
      | residential |
      | business    |
      | public      |