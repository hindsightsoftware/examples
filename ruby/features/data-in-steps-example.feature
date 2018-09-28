Feature: Data in Steps example

  # Supporting code can be found here:
  # https://github.com/hindsightsoftware/examples/blob/master/ruby/features/step_definitions/data-in-steps-step-example.rb

  Scenario: Demonstrating data in steps
    Given I have "2" addresses
    When I add my "business" address
    Then I will have "3" addresses

  Scenario: Demonstrating complex string regexes
    Given I have a pineapple
    When I take an apple
    Then I have an apple and a pineapple

  Scenario: Demonstrating number data types
    Given I have divided the number 1 in half
    Then I will have a result of 0.5